package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.Door;
import ntu.cq.bean.House;
import ntu.cq.bean.PassInfo;
import ntu.cq.bean.Record;
import ntu.cq.dao.DoorDao;
import ntu.cq.utils.ConnectionDB;

public class DoorDaoImpl implements DoorDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public List<Door> getDoorInfo(int Cid) throws SQLException {
		String sql = "select * from dbo.Door where Cid = ?";
		List<Door> list = new ArrayList<Door>();
		Integer[] params = new Integer[1];
		params[0] = Cid;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Door door = new Door();
			door.setDid(rs.getInt("Did"));
			door.setDno(rs.getString("Dno"));
			door.setDir(rs.getString("Ddir"));
			door.setDstatus(rs.getString("Dstatus").trim());
			door.setDip(rs.getString("Dip"));
			list.add(door);
		}
		return list;
	}

	@Override
	public PassInfo getPassInfo(int Did) {
		PassInfo pi = new PassInfo();
		String sql1 = "select count(*) from dbo.ResidentDoor where Did = ?";
		Integer[] params = new Integer[1];
		params[0] = Did;
		pi.setRnum((Integer) db.executeQuerySingle(sql1, params));
		String sql2 = "select count(*) from dbo.VisitDoor where Did = ?";
		pi.setVnum((Integer) db.executeQuerySingle(sql2, params));
		String sql3 = "select count(*) from dbo.UnpermittedPerson where Did = ?";
		pi.setUnum((Integer) db.executeQuerySingle(sql3, params));
		return pi;
	}

	@Override
	public int changeDoorStatus(Door door) {
		String sql = "update dbo.Door set Dstatus=? where Did=?";
		String[] params = new String[2];
		params[0] = door.getDstatus();
		params[1] = door.getDid() + "";
		int flag = 0;
		flag = db.executeUpdate(sql, params);

		return flag;
	}

	@Override
	public Door getDoor(String Dno) throws SQLException {
		String sql = "select * from dbo.Door where Dno = ? ";
		String[] params = new String[1];
		params[0] = Dno;
		ResultSet rs;
		Door d = new Door();
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			d.setDid(rs.getInt("Did"));
			d.setDno(rs.getString("Dno"));
			d.setDip(rs.getString("Dip"));
			d.setDir(rs.getString("Ddir"));
			d.setDstatus(rs.getString("Dstatus"));
			d.setCid(rs.getInt("Cid"));
		}
		return d;
	}

	@Override
	public int addDoor(Door addDoor) {
		String sql = "insert into dbo.Door(Dno,Ddir,Dstatus,Cid) values(?,?,?,?)";
		String[] params = new String[4];
		int flag = 0;
		params[0] = addDoor.getDno();
		params[1] = addDoor.getDir();
		params[2] = addDoor.getDstatus();
		params[3] = addDoor.getCid() + "";
		flag = db.executeUpdate(sql, params);
		return flag;
	}

	@Override
	public List<Record> getRecords(int Rid, String start, String end)
			throws SQLException {
		String sql = "SELECT r.Rid,r.Rname,a.Did,a.RDid,a.RDDate,d.Ddir,d.Dno,b.Rrole "
				+ "FROM dbo.ResidentDoor a,dbo.Resident r,dbo.Door d ,dbo.Role b "
				+ "WHERE RDDate BETWEEN ? AND ? "
				+ "And r.Rid=? "
				+ "And a.Rid=r.Rid "
				+ "And b.RRid=r.RRid "
				+ "And d.Did=a.Did " + "ORDER BY a.RDDate DESC";
		List<Record> list = new ArrayList<Record>();
		String[] params = new String[3];
		params[0] = start;
		params[1] = end;
		params[2] = Rid + "";
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Record record = new Record();
			if (rs.getString("Ddir").trim().equals("in")) {
				record.setDdir("进入");
				record.setColor("navy-bg");
				record.setPic("fa-coffee");
			} else if (rs.getString("Ddir").trim().equals("out")) {
				record.setDdir("离开");
				record.setColor("yellow-bg");
				record.setPic("fa-briefcase");
			}
			if (rs.getString("Rrole").equals("R")) {
				record.setRole("租户");
			} else {
				record.setRole("住户");
			}
			record.setInfo("R");
			record.setId(rs.getInt("Rid"));
			record.setDid(rs.getInt("Did"));
			record.setRDid(rs.getInt("RDid"));
			record.setName(rs.getString("Rname").trim());
			record.setDate(rs.getString("RDDate").trim());
			record.setDno(rs.getString("Dno").trim());
			list.add(record);
		}
		return list;
	}

	@Override
	public List<Record> getResidentRecord(int Did) throws SQLException {
		String sql = "SELECT r.Rid,r.Rname,a.Did,a.RDid,a.RDDate,d.Ddir,d.Dno "
				+ "FROM dbo.ResidentDoor a,dbo.Resident r,dbo.Door d "
				+ "WHERE r.Rid=a.Rid " + "And a.Did=? "
				+ "And d.Did=a.Did ORDER " + "BY a.RDDate DESC";
		List<Record> list = new ArrayList<Record>();
		String[] params = new String[1];
		params[0] = Did + "";
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Record record = new Record();
			if (rs.getString("Ddir").trim().equals("in")) {
				record.setDdir("进入");
				record.setColor("navy-bg");
				record.setPic("fa-coffee");
			} else if (rs.getString("Ddir").trim().equals("out")) {
				record.setDdir("离开");
				record.setColor("yellow-bg");
				record.setPic("fa-briefcase");
			}
			record.setInfo("R");
			record.setId(rs.getInt("Rid"));
			record.setDid(rs.getInt("Did"));
			record.setRDid(rs.getInt("RDid"));
			record.setName(rs.getString("Rname").trim());
			record.setDate(rs.getString("RDDate").trim());
			record.setDno(rs.getString("Dno").trim());
			list.add(record);
		}
		return list;
	}

	@Override
	public List<Record> getDRecords(int Did, String start, String end)
			throws SQLException {
		String sql = "SELECT r.Rid,r.Rname,a.Did,a.RDid,a.RDDate,d.Ddir,d.Dno,b.Rrole "
				+ "FROM dbo.ResidentDoor a,dbo.Resident r,dbo.Door d ,dbo.Role b "
				+ "WHERE RDDate BETWEEN ? AND ? "
				+ "And r.Rid=a.Rid "
				+ "And a.Did=? "
				+ "And b.RRid=r.RRid "
				+ "And d.Did=a.Did "
				+ "ORDER BY a.RDDate DESC";
		List<Record> list = new ArrayList<Record>();
		String[] params = new String[3];
		params[0] = start;
		params[1] = end;
		params[2] = Did + "";
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Record record = new Record();
			if (rs.getString("Ddir").trim().equals("in")) {
				record.setDdir("进入");
				record.setColor("navy-bg");
				record.setPic("fa-coffee");
			} else if (rs.getString("Ddir").trim().equals("out")) {
				record.setDdir("离开");
				record.setColor("yellow-bg");
				record.setPic("fa-briefcase");
			}
			if (rs.getString("Rrole").equals("R")) {
				record.setRole("租户");
			} else {
				record.setRole("住户");
			}
			record.setInfo("R");
			record.setId(rs.getInt("Rid"));
			record.setDid(rs.getInt("Did"));
			record.setRDid(rs.getInt("RDid"));
			record.setName(rs.getString("Rname").trim());
			record.setDate(rs.getString("RDDate").trim());
			record.setDno(rs.getString("Dno").trim());
			list.add(record);
		}
		return list;
	}

	@Override
	public List<Record> getVisitorRecord(int Did) throws SQLException {
		String sql = "SELECT v.Vid,v.Vname,a.Did,a.VDid,a.VDDate,d.Ddir,d.Dno "
				+ "FROM dbo.VisitDoor a,dbo.Visitor v,dbo.Door d "
				+ "WHERE v.Vid=a.Vid " + "And a.Did=? "
				+ "And d.Did=a.Did ORDER " + "BY a.VDDate DESC";
		List<Record> list = new ArrayList<Record>();
		String[] params = new String[1];
		params[0] = Did + "";
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Record record = new Record();
			if (rs.getString("Ddir").trim().equals("in")) {
				record.setDdir("进入");
				record.setColor("navy-bg");
				record.setPic("fa-coffee");
			} else if (rs.getString("Ddir").trim().equals("out")) {
				record.setDdir("离开");
				record.setColor("yellow-bg");
				record.setPic("fa-briefcase");
			}
			record.setInfo("V");
			record.setRole("访客");
			record.setId(rs.getInt("Vid"));
			record.setDid(rs.getInt("Did"));
			record.setRDid(rs.getInt("VDid"));
			record.setName(rs.getString("Vname").trim());
			record.setDate(rs.getString("VDDate").trim());
			record.setDno(rs.getString("Dno").trim());
			list.add(record);
		}
		return list;
	}

	@Override
	public List<Record> getVRecords(int Did, String start, String end)
			throws SQLException {
		String sql = "SELECT v.Vid,v.Vname,a.Did,a.VDid,a.VDDate,d.Ddir,d.Dno "
				+ "FROM dbo.VisitDoor a,dbo.Visitor v,dbo.Door d "
				+ "WHERE VDDate BETWEEN ? AND ? " + "And v.Vid=a.Vid "
				+ "And a.Did=? " + "And d.Did=a.Did "
				+ "ORDER BY a.VDDate DESC";
		List<Record> list = new ArrayList<Record>();
		String[] params = new String[3];
		params[0] = start;
		params[1] = end;
		params[2] = Did + "";
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Record record = new Record();
			if (rs.getString("Ddir").trim().equals("in")) {
				record.setDdir("进入");
				record.setColor("navy-bg");
				record.setPic("fa-coffee");
			} else if (rs.getString("Ddir").trim().equals("out")) {
				record.setDdir("离开");
				record.setColor("yellow-bg");
				record.setPic("fa-briefcase");
			}
			record.setInfo("V");
			record.setRole("访客");
			record.setId(rs.getInt("Vid"));
			record.setDid(rs.getInt("Did"));
			record.setRDid(rs.getInt("VDid"));
			record.setName(rs.getString("Vname").trim());
			record.setDate(rs.getString("VDDate").trim());
			record.setDno(rs.getString("Dno").trim());
			list.add(record);
		}
		return list;
	}

}

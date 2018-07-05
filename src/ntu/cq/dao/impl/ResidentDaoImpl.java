package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.dao.ResidentDao;
import ntu.cq.utils.ConnectionDB;
import ntu.cq.utils.GetOneAge;

public class ResidentDaoImpl implements ResidentDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public List<Resident> getResidents(int Hid) throws SQLException {
		List<Resident> list = new ArrayList<Resident>();
		String sql = "select r.Rid,r.Ridc,r.Rusername,r.Rname,r.Rgender,r.Uid,r.RRid,r.Rtel,r.Rdob,r.Rpic,r.uname,l.RRole,b.Bname,h.Haddr "
				+ "from dbo.Resident r,dbo.Role l,dbo.Building b,dbo.House h,dbo.Live i "
				+ "where r.Rid in( "
				+ "select Rid from dbo.Live where Hid=?"
				+ ") "
				+ "and l.RRid=r.RRid "
				+ "and i.Rid=r.Rid "
				+ "and h.Hid=i.Hid " + "and b.Bid=h.Bid";
		Integer[] params = new Integer[1];
		params[0] = Hid;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Resident resident = new Resident();
			resident.setRname(rs.getString("Rname"));
			resident.setRid(rs.getInt("Rid"));
			resident.setRidc(rs.getString("Ridc"));
			resident.setRgender(rs.getString("Rgender"));
			resident.setRtel(rs.getString("Rtel"));
			resident.setRRid(rs.getInt("RRid"));
			resident.setRusername(rs.getString("Rusername"));
			resident.setBname(rs.getString("Bname"));
			resident.setHaddr(rs.getString("Haddr"));
			resident.setRRole(rs.getString("RRole"));
			
			resident.setUname(rs.getString("uname"));
			resident.setUid(rs.getInt("Uid"));
			System.out.println(resident.getRname()+resident.getUid());
			if(resident.getUid()==0){
				resident.setRpic("N");
			}
			System.out.println(resident.getRpic());
			String dob = rs.getString("Rdob");
			resident.setRdob(dob);
			int age = 0;
			try {
				Date dateOfBirth = GetOneAge.parse(dob);
				age = GetOneAge.getAge(dateOfBirth);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resident.setRage(age);
			list.add(resident);
		}
		return list;
	}

	@Override
	public Resident getResident(int Rid) throws SQLException {
		String sql = "select r.Rid,r.Ridc,r.Rusername,r.Rname,r.Rgender,r.RRid,r.Rtel,r.Rdob,l.RRole,b.Bname,h.Haddr "
				+ "from dbo.Resident r,dbo.Role l,dbo.Building b,dbo.House h,dbo.Live i "
				+ "where r.Rid =? "
				+ "and l.RRid=r.RRid "
				+ "and i.Rid=r.Rid "
				+ "and h.Hid=i.Hid " + "and b.Bid=h.Bid";
		Integer[] params = new Integer[1];
		params[0] = Rid;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		Resident resident = new Resident();
		while (rs.next()) {
			resident.setRname(rs.getString("Rname").trim());
			resident.setRid(rs.getInt("Rid"));
			resident.setRidc(rs.getString("Ridc").trim());
			resident.setRgender(rs.getString("Rgender").trim());
			resident.setRtel(rs.getString("Rtel").trim());
			resident.setRRid(rs.getInt("RRid"));
			resident.setRusername(rs.getString("Rusername").trim());
			resident.setBname(rs.getString("Bname").trim());
			resident.setHaddr(rs.getString("Haddr").trim());
			resident.setRRole(rs.getString("RRole").trim());
			String dob = rs.getString("Rdob");
			resident.setRdob(dob);
			int age = 0;
			try {
				Date dateOfBirth = GetOneAge.parse(dob);
				age = GetOneAge.getAge(dateOfBirth);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resident.setRage(age);
		}
		return resident;
	}

	@Override
	public Visitor getVisitor(int Vid) throws SQLException {
		String sql = "select v.Vid,v.Vname,v.Vgender,v.Vtel,v.Vdob,b.Bname,h.Haddr "
				+ "from dbo.Visitor v,dbo.Building b,dbo.House h,dbo.VisitHouse i "
				+ "where v.Vid =? "
				+ "and i.Vid=v.Vid "
				+ "and h.Hid=i.Hid "
				+ "and b.Bid=h.Bid";
		Integer[] params = new Integer[1];
		params[0] = Vid;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		Visitor visitor = new Visitor();
		while (rs.next()) {
			visitor.setVname(rs.getString("Vname").trim());
			visitor.setVid(rs.getInt("Vid"));
			visitor.setVgender(rs.getString("Vgender").trim());
			visitor.setVtel(rs.getString("Vtel").trim());
			visitor.setBname(rs.getString("Bname").trim());
			visitor.setHaddr(rs.getString("Haddr").trim());
			visitor.setVrole("·Ã¿Í");
			String dob = rs.getString("Vdob");
			visitor.setVdob(dob);
			int age = 0;
			try {
				Date dateOfBirth = GetOneAge.parse(dob);
				age = GetOneAge.getAge(dateOfBirth);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			visitor.setVage(age);
		}
		return visitor;
	}

	@Override
	public int deleteResident(int Rid) {
		String sql = "delete from dbo.Live where Rid=?";
		String sql1 = "delete from dbo.Resident where Rid=?";
		Integer[] params = new Integer[1];
		params[0] = Rid;
		int result = 0;
		result = db.executeUpdate(sql, params);
		result += db.executeUpdate(sql1, params);
		return result;
	}

	@Override
	public int updateResident(Resident resident) throws SQLException {
		String sql1 = "select RRid  from dbo.Role where RRole=?";
		String[] params1 = new String[1];
		params1[0] = resident.getRRole().trim();
		int RRid=0;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql1, params1);
		while (rs.next()) {
			RRid=rs.getInt("RRid");
		}
		String sql2="select Hid from dbo.House where Haddr=? and Bid=(select Bid from dbo.Building where Bname=?)";
		String[] params2 = new String[2];
		params2[0] = resident.getHaddr().trim();
		params2[1] = resident.getBname().trim();
		int Hid=0;
		rs = db.executeQueryRS(sql2, params2);
		while (rs.next()) {
			Hid=rs.getInt("Hid");
		}
		int result=0;
		if(resident.getRRole().trim().equals("R")){
			String s="update dbo.House set Hstatus=? where Hid=?";
			String[] p=new String[2];
			p[0]="R";
			p[1]=Hid+"";
			result += db.executeUpdate(s, p);
		}else{
			String s="update dbo.House set Hstatus=? where Hid=?";
			String[] p=new String[2];
			p[0]="L";
			p[1]=Hid+"";
			result += db.executeUpdate(s, p);
		}
		String sql3="update dbo.Live set Hid=? where Rid=?";
		Integer[] params3 = new Integer[2];
		params3[0] = Hid;
		params3[1] = resident.getRid();
		
		result += db.executeUpdate(sql3, params3);
		
		String sql = "update dbo.Resident set Rusername=?,Rpassword=sys.fn_sqlvarbasetostr(HASHBYTES('MD5',?)),Rtel=?,RRid=? where Rid=?";
		String[] params = new String[5];
		params[0] = resident.getRusername().trim();
		params[1] = resident.getRpassword().trim();
		params[2] = resident.getRtel().trim();
		params[3] = RRid+"";
		params[4] = resident.getRid() + "";
		result += db.executeUpdate(sql, params);
		return result;
	}

	@Override
	public List<Resident> getReUnExamine(int cid) throws SQLException {
		String sql="select Rid,Rname "
				+ "from dbo.Resident "
				+ "where Rid in("
				+ "select Rid "
				+ "from dbo.Live "
				+ "where Hid in ("
				+ "select Hid "
				+ "from dbo.House "
				+ "where Bid IN("
				+ "select Bid "
				+ "from dbo.Building "
				+ "where Cid = ?))) "
				+ "and Rstatus = 'N'";
		Integer[] params=new Integer[1];
		params[0]=cid;
		List<Resident> list=new ArrayList<Resident>();
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Resident r=new Resident();
			r.setRid(rs.getInt("Rid"));
			r.setRname(rs.getString("Rname"));
			list.add(r);
		}
		return list;
	}

	@Override
	public int comfirm(int id) {
		String sql="update dbo.Resident set Rstatus='Y' where Rid=?";
		Integer[] params=new Integer[1];
		params[0]=id;
		int result = 0;
		result = db.executeUpdate(sql, params);
		return result;
	}

	@Override
	public int getRecords(String startTime,String endTime,int cid) {
		String sql="select count(*) from dbo.ResidentDoor where Did in(select Did from dbo.Door where Cid=?) and RDDate between ? and ?";
		String[] params=new String[3];
		params[0]=cid+"";
		params[1]=startTime;
		params[2]=endTime;
		int count=0;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		try {
			while (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int getApplyCount() {
		String sql="select count(*) from dbo.Resident where Rstatus = 'N'";
		Integer[] params=new Integer[0];
		int count=0;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		try {
			while (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int getCount(String hstatus) {
		String sql="select count(*) from dbo.House where Hstatus=?";
		String[] params=new String[1];
		params[0]=hstatus;
		int count=0;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		try {
			while (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}

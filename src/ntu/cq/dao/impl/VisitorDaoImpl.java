package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.dao.VisitorDao;
import ntu.cq.utils.ConnectionDB;
import ntu.cq.utils.GetOneAge;

public class VisitorDaoImpl implements VisitorDao {

	ConnectionDB db = new ConnectionDB();
	@Override
	public List<Visitor> getVisitor(int Hid) throws SQLException {
		List<Visitor> list=new ArrayList<Visitor>();
		String sql = "select v.Vid,v.Vname,v.Vgender,v.Vtel,v.Vdob,v.Uid,v.uname,b.Bname,h.Haddr "
				+ "from dbo.Visitor v,dbo.Building b,dbo.House h,dbo.VisitHouse i "
				+ "where v.Vid in "
				+ "(select Vid from dbo.VisitHouse where Hid=?) "
				+ "and i.Vid=v.Vid "
				+ "and h.Hid=i.Hid "
				+ "and b.Bid=h.Bid";
		Integer[] params = new Integer[1];
		params[0] = Hid;
		ResultSet rs=null;
		rs=db.executeQueryRS(sql,params);
		while(rs.next()){
			Visitor visitor=new Visitor();
			visitor.setVname(rs.getString("Vname").trim());
			visitor.setVid(rs.getInt("Vid"));
			visitor.setVgender(rs.getString("Vgender").trim());
			visitor.setVtel(rs.getString("Vtel").trim());
			visitor.setBname(rs.getString("Bname").trim());
			visitor.setHaddr(rs.getString("Haddr").trim());
			visitor.setVrole("·Ã¿Í");
			visitor.setUid(rs.getInt("Uid"));
			if(visitor.getUid()==0){
				visitor.setVpic("N");
			}
			String dob=rs.getString("Vdob");
			visitor.setVdob(dob);
			int age=0;
			try {
				Date dateOfBirth=GetOneAge.parse(dob);
				age=GetOneAge.getAge(dateOfBirth);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			visitor.setVage(age);
			list.add(visitor);
		}
		return list;
	}
	@Override
	public List<Visitor> getViUnExamine(int cid) throws SQLException {
		String sql="select Vid,Vname "
				+ "from dbo.Visitor "
				+ "where Vid in("
				+ "select Vid "
				+ "from dbo.VisitHouse "
				+ "where Hid in("
				+ "select Hid "
				+ "from dbo.House "
				+ "where Bid IN("
				+ "select Bid "
				+ "from dbo.Building "
				+ "where Cid = ?))) "
				+ "and Vstatus = 'N'";
		Integer[] params=new Integer[1];
		params[0]=cid;
		List<Visitor> list=new ArrayList<Visitor>();
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			Visitor r=new Visitor();
			r.setVid(rs.getInt("Vid"));
			r.setVname(rs.getString("Vname"));
			list.add(r);
		}
		return list;
	}
	@Override
	public int comfirm(int id) {
		String sql="update dbo.Visitor set Vstatus='Y' where Vid=?";
		Integer[] params=new Integer[1];
		params[0]=id;
		int result = 0;
		result = db.executeUpdate(sql, params);
		return result;
	}
	@Override
	public int getRecords(String startTime,String endTime,int cid) {
		String sql="select count(*) from dbo.VisitDoor where Did in(select Did from dbo.Door where Cid=?) and VDDate between ? and ?";
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
	public int getCount() {
		String sql="select count(*) from dbo.Visitor where Vstatus='Y'";
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
	public int getApplyCount() {
		String sql="select count(*) from dbo.Visitor where Vstatus = 'N'";
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

}

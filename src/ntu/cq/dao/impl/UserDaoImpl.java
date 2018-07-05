package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import ntu.cq.bean.House;
import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.dao.UserDao;
import ntu.cq.utils.ConnectionDB;

public class UserDaoImpl implements UserDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public boolean getUserByUsernameAndPassword(String username, String password) {
		String sql = "Select * from dbo.PropertyStaff where Pusername = ? and Ppassword = ?";
		String[] params = new String[2];
		params[0] = username;
		params[1] = password;
		if (db.executeQuerySingle(sql, params)!=null) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean saveUser(PropertyStaff propertyStaff) {
		String sql = "insert into dbo.PropertyStaff(Pusername,Ppassword) values(?,?)";
		String[] params = new String[2];
		params[0] = propertyStaff.getUsername();
		params[1] = propertyStaff.getPassword();
		if (db.executeUpdate(sql, params)!=0) {
			return true;
		} else
			return false;
	}

	@Override
	public PropertyStaff getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropertyStaff getCid(String username) throws SQLException {
		PropertyStaff prs=new PropertyStaff();
		String sql = "Select * from dbo.PropertyStaff where Pusername = ? ";
		String[] params = new String[1];
		params[0] = username;
		ResultSet rs=null;
		rs=db.executeQueryRS(sql,params);
		while(rs.next()){
			prs.setPid(rs.getInt("Pid"));
			prs.setPname(rs.getString("Pname"));
			prs.setPgender(rs.getString("Pgender"));
			prs.setPstaffno(rs.getString("Pstaffno"));
			prs.setPtel(rs.getString("Ptel"));
			prs.setRRid(rs.getInt("RRid"));
			prs.setUsername(rs.getString("Pusername"));
			prs.setPassword(rs.getString("Ppassword"));
			prs.setCid(rs.getInt("Cid"));
		}
		return prs;
		
	}

	@Override
	public int registVisitor(Visitor v) throws SQLException {
		String sql="insert into dbo.Visitor(Vname,Vgender,Vdob,Vtel,Vstatus,Vpic,uname) values(?,?,?,?,?,?,?)";
		String[] params=new String[7];
		params[0]=v.getVname();
		params[1]=v.getVgender();
		params[2]=v.getVdob();
		params[3]=v.getVtel();
		params[4]=v.getVstatus();
		params[5]=v.getVpic();
		params[6]=v.getUname();
		int result=db.executeUpdate(sql, params);
		int vid=0;
		if(result==1){
			String s2="select Vid from dbo.Visitor where Vname=? and Vtel=?";
			String[] p2=new String[2];
			p2[0]=v.getVname();
			p2[1]=v.getVtel();
			ResultSet rs=null;
			rs=db.executeQueryRS(s2,p2);
			while(rs.next()){
				vid=rs.getInt("Vid");
			}
			String s3="insert into dbo.VisitHouse values(?,?,?,?)";
			String[] p3=new String[4];
			p3[0]=vid+"";
			p3[1]=v.getHid()+"";
			p3[2]=v.getVdate();
			p3[3]=v.getEdate();
			result+=db.executeUpdate(s3, p3);
		}
		return vid;
	}

	@Override
	public int registResident(Resident r) throws SQLException {
		String s="select RRid from dbo.Role where RRole=?";
		String[] p=new String[1];
		p[0]=r.getRRole();
		int rid=0;
		ResultSet rs=null;
		rs=db.executeQueryRS(s,p);
		int rrid=0;
		while(rs.next()){
			rrid=rs.getInt("RRid");
		}
		String sql="insert into dbo.Resident(Rname,Rgender,Ridc,Rtel,RRid,Rusername,Rpassword,Rdob,Rstatus,Rpic,uname) values(?,?,?,?,?,?,sys.fn_sqlvarbasetostr(HASHBYTES('MD5',?)),?,?,?,?)";
		String[] params=new String[11];
		params[0]=r.getRname();
		params[1]=r.getRgender();
		params[2]=r.getRidc();
		params[3]=r.getRtel();
		params[4]=rrid+"";
		params[5]=r.getRusername();
		params[6]=r.getRpassword();
		params[7]=r.getRdob();
		params[8]=r.getRstatus();
		params[9]=r.getRpic();
		params[10]=r.getUname();
		int result=db.executeUpdate(sql, params);
		if(result==1){
			String s2="select Rid from dbo.Resident where Rusername=?";
			String[] p2=new String[1];
			p2[0]=r.getRusername();
			rs=db.executeQueryRS(s2,p2);
			while(rs.next()){
				rid=rs.getInt("Rid");
			}
			String s3="insert into dbo.Live values(?,?)";
			Integer[] p3=new Integer[2];
			p3[0]=r.getHid();
			p3[1]=rid;
			result+=db.executeUpdate(s3, p3);
			
		}
		if(r.getRRole().equals("H")){
			String up="update dbo.House set Hstatus=? where Hid=?";
			String[] pp=new String[2];
			pp[0]="L";
			pp[1]=r.getHid()+"";
			db.executeUpdate(up, pp);
		}else if(r.getRRole().equals("R")){
			String up="update dbo.House set Hstatus=? where Hid=?";
			String[] pp=new String[2];
			pp[0]="R";
			pp[1]=r.getHid()+"";
			db.executeUpdate(up, pp);
		}
		return rid;
	}

	@Override
	public int getUid(String uname) throws SQLException {
		String sql="select Uid from dbo.ArcFeature where uname=?";
		String[] params=new String[1];
		params[0]=uname;
		ResultSet rs=null; 
		rs=db.executeQueryRS(sql,params);
		int uid=0;
		while(rs.next()){
			uid=rs.getInt("Uid");
		}
		return uid;
	}

}
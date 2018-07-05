package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import ntu.cq.bean.Door;
import ntu.cq.dao.UploadDao;
import ntu.cq.utils.ConnectionDB;

public class UploadDaoImpl implements UploadDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public int getUid(String uname) throws SQLException {
		String sql = "select Uid from dbo.ArcFeature where uname=?";
		String[] params = new String[1];
		params[0] = uname;
		ResultSet rs = null;
		int uid=0;
		rs = db.executeQueryRS(sql, params);
		while (rs.next()) {
			uid=rs.getInt("Uid");	
		}
		return uid;
	}

	@Override
	public int addUidResident(int Uid, int Rid) {
		String sql="update dbo.Resident set Uid=? where Rid=?";
		Integer[] params=new Integer[2];
		params[0]=Uid;
		params[1]=Rid;
		int result=0;
		result=db.executeUpdate(sql, params);
		return result;
	}

	@Override
	public int addUidVisitor(int Uid, int Vid) {
		String sql="update dbo.Visitor set Uid=? where Vid=?";
		Integer[] params=new Integer[2];
		params[0]=Uid;
		params[1]=Vid;
		int result=0;
		result=db.executeUpdate(sql, params);
		return result;
	}

}

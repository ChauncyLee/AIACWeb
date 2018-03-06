package ntu.cq.dao.impl;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;
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
	public int getCid(String username) {
		String sql = "Select Cid from dbo.PropertyStaff where Pusername = ? ";
		String[] params = new String[1];
		params[0] = username;
		int cid=0;
		cid=(Integer) db.executeQuerySingle(sql, params);
		if (cid!=0) {
			return cid;
		} else
		return 0;
	}

}
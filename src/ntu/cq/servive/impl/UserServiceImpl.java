package ntu.cq.servive.impl;

import java.sql.SQLException;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.User;
import ntu.cq.bean.Visitor;
import ntu.cq.dao.UserDao;
import ntu.cq.dao.impl.UserDaoImpl;
import ntu.cq.servive.UserService;

public class UserServiceImpl implements UserService {

	// 创建一个UserDao 对象
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean login(String username,String password) {
		return  userDao.getUserByUsernameAndPassword(username,password);
	}

	@Override
	public boolean regist(PropertyStaff user) {

		return userDao.saveUser(user);
	}

	@Override
	public boolean checkUsername(String username) {

		return false;
	}

	@Override
	public PropertyStaff getCid(String username) throws SQLException {
		return userDao.getCid(username);
	}

	@Override
	public int registVisitor(Visitor v) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.registVisitor(v);
	}

	@Override
	public int registResident(Resident r) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.registResident(r);
	}

	@Override
	public int getUid(String uname) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getUid(uname);
	}

}

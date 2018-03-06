package ntu.cq.servive.impl;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;
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
	public int getCid(String username) {
		return userDao.getCid(username);
	}

}

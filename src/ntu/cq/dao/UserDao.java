package ntu.cq.dao;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;

public interface UserDao {
	/**
	 * 根据用户名和密码查询用户
	 * 
	 * @param user
	 * @return
	 */
	boolean getUserByUsernameAndPassword(String username,String password);

	/**
	 * 向数据库中插入一个用户对象
	 * 
	 * @param user
	 * @return
	 */
	boolean saveUser(PropertyStaff propertyStaff);
	
    /**
     *  根据用户名查找用户对象
     * @param username
     */
	PropertyStaff getUserByUsername(String username);
}

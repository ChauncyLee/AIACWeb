package ntu.cq.dao;

import java.sql.SQLException;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.User;
import ntu.cq.bean.Visitor;

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
	
	/**
	 * 根据用户名获取该职工所在小区Cid
	 * @param username
	 * @return
	 * @throws SQLException 
	 */
	PropertyStaff getCid(String username) throws SQLException;
	
	 /**
     * 将访客添加进去
     * @param v
     * @return
	 * @throws SQLException 
     */
    int registVisitor(Visitor v) throws SQLException;
    
    /**
     * 将住户添加进去，返回受影响的行数
     * @param r
     * @return
     * @throws SQLException 
     */
    int registResident(Resident r) throws SQLException;
    

	 /**
    * 通过uname查询特征值Uid
    * @param uname
    * @return
	 * @throws SQLException 
    */
   int getUid(String uname) throws SQLException;
}

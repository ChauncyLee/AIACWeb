package ntu.cq.servive;

import java.sql.SQLException;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;

public interface UserService {
	/**
	 * 用户登录的方法
	 * @param user
	 * @return
	 */
	boolean login(String username,String password);
    /**
     * 用户注册的方法
     * @param user
     * @return
     */
    
    boolean regist(PropertyStaff user);
    /**
     * 检查用户名是否可用，如果可用返回true , 否则返回false
     * @param username
     * @return
     */
    boolean checkUsername(String username);
    
    /**
     * 根据用户名获取该职工个人信息
     * @param username
     * @return
     * @throws SQLException 
     */
    PropertyStaff getCid(String username) throws SQLException;
    
    /**
     * 将访客添加进去，返回受影响的行数
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

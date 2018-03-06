package ntu.cq.servive;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;

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
     * 根据用户名获取该职工所在小区
     * @param username
     * @return
     */
    int getCid(String username);
}

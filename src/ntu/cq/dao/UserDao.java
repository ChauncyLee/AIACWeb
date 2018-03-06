package ntu.cq.dao;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;

public interface UserDao {
	/**
	 * �����û����������ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	boolean getUserByUsernameAndPassword(String username,String password);

	/**
	 * �����ݿ��в���һ���û�����
	 * 
	 * @param user
	 * @return
	 */
	boolean saveUser(PropertyStaff propertyStaff);
	
    /**
     *  �����û��������û�����
     * @param username
     */
	PropertyStaff getUserByUsername(String username);
}

package ntu.cq.dao;

import java.sql.SQLException;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.User;
import ntu.cq.bean.Visitor;

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
	
	/**
	 * �����û�����ȡ��ְ������С��Cid
	 * @param username
	 * @return
	 * @throws SQLException 
	 */
	PropertyStaff getCid(String username) throws SQLException;
	
	 /**
     * ���ÿ���ӽ�ȥ
     * @param v
     * @return
	 * @throws SQLException 
     */
    int registVisitor(Visitor v) throws SQLException;
    
    /**
     * ��ס����ӽ�ȥ��������Ӱ�������
     * @param r
     * @return
     * @throws SQLException 
     */
    int registResident(Resident r) throws SQLException;
    

	 /**
    * ͨ��uname��ѯ����ֵUid
    * @param uname
    * @return
	 * @throws SQLException 
    */
   int getUid(String uname) throws SQLException;
}

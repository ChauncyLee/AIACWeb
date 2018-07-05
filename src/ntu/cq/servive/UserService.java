package ntu.cq.servive;

import java.sql.SQLException;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;

public interface UserService {
	/**
	 * �û���¼�ķ���
	 * @param user
	 * @return
	 */
	boolean login(String username,String password);
    /**
     * �û�ע��ķ���
     * @param user
     * @return
     */
    
    boolean regist(PropertyStaff user);
    /**
     * ����û����Ƿ���ã�������÷���true , ���򷵻�false
     * @param username
     * @return
     */
    boolean checkUsername(String username);
    
    /**
     * �����û�����ȡ��ְ��������Ϣ
     * @param username
     * @return
     * @throws SQLException 
     */
    PropertyStaff getCid(String username) throws SQLException;
    
    /**
     * ���ÿ���ӽ�ȥ��������Ӱ�������
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

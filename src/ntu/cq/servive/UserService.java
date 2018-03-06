package ntu.cq.servive;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;

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
     * �����û�����ȡ��ְ������С��
     * @param username
     * @return
     */
    int getCid(String username);
}

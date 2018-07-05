package ntu.cq.dao;

import java.sql.SQLException;

public interface UploadDao {

	/**
	 * ��uname��ȡ���û���Uid
	 * @param uname
	 * @return
	 * @throws SQLException 
	 */
	int getUid(String uname) throws SQLException;
	
	/**
	 * ����Rid��Uid�鵽���û��ı���
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidResident(int Uid,int Rid);
	/**
	 * ����Vid��Uid�鵽���û��ı���
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidVisitor(int Uid,int Vid);
}

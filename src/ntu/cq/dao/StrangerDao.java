package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Stranger;

public interface StrangerDao {

	/**
	 * ��ȡδ�����Ա����Ϣ
	 * @return
	 * @throws SQLException 
	 */
	List<Stranger> getStranger() throws SQLException;
	
	/**
	 * ��ȡδʶ����Ա�ļ�¼��
	 * @return
	 */
	int getCount();
}

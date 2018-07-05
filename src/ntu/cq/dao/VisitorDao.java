package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Visitor;

public interface VisitorDao {

	
	/**
	 * ͨ�����ӵ�Hid��ȡ���ʸû��ķÿ�����
	 * @param Hid
	 * @return
	 * @throws SQLException 
	 */
	List<Visitor> getVisitor(int Hid) throws SQLException;

	/**
	 * ��ȡδ��˵ķÿ�����
	 * @param cid
	 * @return
	 * @throws SQLException
	 */
	List<Visitor> getViUnExamine(int cid)throws SQLException;
	
	/**
	 * ȷ�����״̬
	 * @param id
	 * @return
	 */
	int comfirm(int id);
	
	/**
	 * ��ȡס��������¼��
	 * @param cid
	 * @return
	 */
	int getRecords(String startTime,String endTime,int cid);
	
	/**
	 * ��ȡ����˵ķÿ���
	 * @return
	 */
	int getCount();
	
	/**
	 * ��ȡ����˵ķÿ���
	 * @return
	 */
	int getApplyCount();

}

package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;

public interface ResidentDao {
	/**
	 * ���ݷ���Hid��ȡ��ס�ڸ÷��ݵľ�����Ϣ
	 * @param Hid
	 * @return
	 * @throws SQLException 
	 */
	List<Resident> getResidents(int Hid) throws SQLException;
	
	/**
	 *ͨ��Rid��ȡ���û��ĸ�����Ϣ 
	 * @param Rid
	 * @return
	 * @throws SQLException 
	 */
	Resident getResident(int Rid) throws SQLException;
	
	/**
	 * ͨ��Rid��ȡ�ķÿ͵ĸ�����Ϣ
	 * @param Rid
	 * @return
	 * @throws SQLException 
	 */
	Visitor getVisitor(int Rid) throws SQLException;
	
	/**
	 * ͨ��Ridɾ���û���������Ӱ�������
	 * @param Rid
	 * @return
	 */
	int deleteResident(int Rid);
	
	/**
	 * ���û���Ϣ�����޸ģ�������Ӱ�������
	 * @param resident
	 * @return
	 * @throws SQLException 
	 */
	int updateResident(Resident resident) throws SQLException;
	/**
	 *��ȡû����˵�ס��
	 * @param cid
	 * @return
	 * @throws SQLException 
	 */
	List<Resident> getReUnExamine(int cid) throws SQLException;
	
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
	 * ��ȡ����˵�ס����
	 * @return
	 */
	int getApplyCount();
	
	/**
	 * ��ȡ��Ӧ���͵�ס����
	 * @return
	 */
	int getCount(String hstatus);
}

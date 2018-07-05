package ntu.cq.servive;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Door;
import ntu.cq.bean.PassInfo;
import ntu.cq.bean.Record;

public interface DoorService {
	
	
	/**
	 * ����С���Ż�ȡ��С�������Ž���Ϣ
	 * @param Cid
	 * @return
	 * @throws SQLException 
	 */
	List<Door> getDoorInfo(int Cid) throws SQLException;
	
	/**
	 * ����Did���ͨ�����Ž��ľ��񡢷ÿ��Լ�δ׼����������
	 * @param Did
	 * @return
	 */
	PassInfo getPassInfo(int Did);
	
	/**
	 * ͨ��Did�޸ĸ��ŵ�״̬
	 * @param Did
	 * @return
	 */
	int changeDoorStatus(Door door);
	
	/**
	 * ����Dno��ѯ���Ž��Ƿ����
	 * @param str
	 * @return
	 * @throws SQLException 
	 */
	Door getDoor(String Dno) throws SQLException;
	
	/**
	 * ��addDoor�������ݿⲢ������Ӱ������
	 * @param addDoor
	 * @return
	 */
	int addDoor(Door addDoor);
	
	/**
	 * ����ס��Rid����ʼʱ�䣬��ѯ��ס���ĳ��м�¼�������ؼ�¼����
	 * @param Rid
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getRecords(int Rid,String start,String end) throws SQLException;
	
	/**
	 * ����Did��ѯ����ͨ�����Ž��������û�
	 * @param Did
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getResidentRecord(int Did) throws SQLException;
	
	/**
	 * �����Ž�Did����ʼʱ�䣬��ѯ��ס���ĳ��м�¼�������ؼ�¼����
	 * @param Did
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getDRecords(int Did,String start,String end) throws SQLException;
	
	/**
	 * ����Did��ѯ����ͨ�����Ž������зÿ�
	 * @param Did
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getVisitorRecord(int Did) throws SQLException;
	
	/**
	 * �����Ž�Did����ʼʱ�䣬��ѯ��ס���ĳ��м�¼�������ؼ�¼����
	 * @param Did
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getVRecords(int Did,String start,String end) throws SQLException;
}

package ntu.cq.servive;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;

public interface BuildingService {
	
	/**
	 * ����С��������ȡ��С��¥����Ŀ
	 * @param Cid
	 * @return
	 */
	int getBuildingCount(int Cid);
	
	/**
	 * ����¥�Ż�ȡ��¥ס������Ϣ
	 * @param Bname
	 * @return
	 * @throws SQLException 
	 */
	Building getBuilding(String Bname) throws SQLException;
	
	/**
	 * ����¥��Bid��ȡ��¥����Ϣ
	 * @param Bid
	 * @return
	 * @throws SQLException 
	 */
	List<House>  getBuildingInfo(int Bid) throws SQLException;
	
	/**
	 * ��Cid��ȡ��С������¥��������
	 * @param Cid
	 * @return
	 * @throws SQLException 
	 */
	List<Building> getBname(int Cid) throws SQLException;
	
	/**
	 * ������ӵ�Building��ӵ����ݿ⣬��ӳɹ�������Ӱ������
	 * @param addBuilding
	 * @return
	 */
	int addBuilding(Building addBuilding);
	
	/**
	 * ������ӵ�Building��Ӹ�¥���ķ���
	 * @param list
	 * @return
	 */
	int addHouse(List<House> list);
	
	
	
}

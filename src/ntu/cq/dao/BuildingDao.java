package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;

public interface BuildingDao {

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
}

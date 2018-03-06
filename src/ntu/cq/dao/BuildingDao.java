package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;

public interface BuildingDao {

	/**
	 * 根据小区主键获取该小区楼栋数目
	 * @param Cid
	 * @return
	 */
	int getBuildingCount(int Cid);
	
	/**
	 * 根据楼号获取该楼住户的信息
	 * @param Bname
	 * @return
	 * @throws SQLException 
	 */
	Building getBuilding(String Bname) throws SQLException;
	
	/**
	 * 根据楼栋Bid获取该楼的信息
	 * @param Bid
	 * @return
	 * @throws SQLException 
	 */
	List<House>  getBuildingInfo(int Bid) throws SQLException;
}

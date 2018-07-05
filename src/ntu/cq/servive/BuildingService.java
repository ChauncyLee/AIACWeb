package ntu.cq.servive;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;

public interface BuildingService {
	
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
	
	/**
	 * 由Cid获取该小区所有楼栋的名字
	 * @param Cid
	 * @return
	 * @throws SQLException 
	 */
	List<Building> getBname(int Cid) throws SQLException;
	
	/**
	 * 将新添加的Building添加到数据库，添加成功返回受影响行数
	 * @param addBuilding
	 * @return
	 */
	int addBuilding(Building addBuilding);
	
	/**
	 * 将新添加的Building添加该楼栋的房间
	 * @param list
	 * @return
	 */
	int addHouse(List<House> list);
	
	
	
}

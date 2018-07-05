package ntu.cq.servive;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Door;
import ntu.cq.bean.PassInfo;
import ntu.cq.bean.Record;

public interface DoorService {
	
	
	/**
	 * 根据小区号获取该小区所有门禁信息
	 * @param Cid
	 * @return
	 * @throws SQLException 
	 */
	List<Door> getDoorInfo(int Cid) throws SQLException;
	
	/**
	 * 根据Did查出通过该门禁的居民、访客以及未准许进入的人数
	 * @param Did
	 * @return
	 */
	PassInfo getPassInfo(int Did);
	
	/**
	 * 通过Did修改该门的状态
	 * @param Did
	 * @return
	 */
	int changeDoorStatus(Door door);
	
	/**
	 * 根据Dno查询该门禁是否存在
	 * @param str
	 * @return
	 * @throws SQLException 
	 */
	Door getDoor(String Dno) throws SQLException;
	
	/**
	 * 将addDoor存入数据库并返回受影响行数
	 * @param addDoor
	 * @return
	 */
	int addDoor(Door addDoor);
	
	/**
	 * 根据住户Rid和起始时间，查询该住户的出行记录，并返回记录集合
	 * @param Rid
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getRecords(int Rid,String start,String end) throws SQLException;
	
	/**
	 * 根据Did查询近期通过此门禁的所有用户
	 * @param Did
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getResidentRecord(int Did) throws SQLException;
	
	/**
	 * 根据门禁Did和起始时间，查询该住户的出行记录，并返回记录集合
	 * @param Did
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getDRecords(int Did,String start,String end) throws SQLException;
	
	/**
	 * 根据Did查询近期通过此门禁的所有访客
	 * @param Did
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getVisitorRecord(int Did) throws SQLException;
	
	/**
	 * 根据门禁Did和起始时间，查询该住户的出行记录，并返回记录集合
	 * @param Did
	 * @param start
	 * @param end
	 * @return
	 * @throws SQLException 
	 */
	List<Record> getVRecords(int Did,String start,String end) throws SQLException;
}

package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;

public interface ResidentDao {
	/**
	 * 根据房屋Hid获取居住在该房屋的居民信息
	 * @param Hid
	 * @return
	 * @throws SQLException 
	 */
	List<Resident> getResidents(int Hid) throws SQLException;
	
	/**
	 *通过Rid获取该用户的个人信息 
	 * @param Rid
	 * @return
	 * @throws SQLException 
	 */
	Resident getResident(int Rid) throws SQLException;
	
	/**
	 * 通过Rid获取改访客的个人信息
	 * @param Rid
	 * @return
	 * @throws SQLException 
	 */
	Visitor getVisitor(int Rid) throws SQLException;
	
	/**
	 * 通过Rid删除用户，返回受影响的行数
	 * @param Rid
	 * @return
	 */
	int deleteResident(int Rid);
	
	/**
	 * 将用户信息进行修改，返回受影响的行数
	 * @param resident
	 * @return
	 * @throws SQLException 
	 */
	int updateResident(Resident resident) throws SQLException;
	/**
	 *获取没有审核的住户
	 * @param cid
	 * @return
	 * @throws SQLException 
	 */
	List<Resident> getReUnExamine(int cid) throws SQLException;
	
	/**
	 * 确认审核状态
	 * @param id
	 * @return
	 */
	int comfirm(int id);

	/**
	 * 获取住户进出记录数
	 * @param cid
	 * @return
	 */
	int getRecords(String startTime,String endTime,int cid);
	
	/**
	 * 获取待审核的住户数
	 * @return
	 */
	int getApplyCount();
	
	/**
	 * 获取对应类型的住户数
	 * @return
	 */
	int getCount(String hstatus);
}

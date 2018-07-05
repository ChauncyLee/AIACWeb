package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Visitor;

public interface VisitorDao {

	
	/**
	 * 通过房子的Hid获取访问该户的访客名单
	 * @param Hid
	 * @return
	 * @throws SQLException 
	 */
	List<Visitor> getVisitor(int Hid) throws SQLException;

	/**
	 * 获取未审核的访客名单
	 * @param cid
	 * @return
	 * @throws SQLException
	 */
	List<Visitor> getViUnExamine(int cid)throws SQLException;
	
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
	 * 获取已审核的访客数
	 * @return
	 */
	int getCount();
	
	/**
	 * 获取待审核的访客数
	 * @return
	 */
	int getApplyCount();

}

package ntu.cq.dao;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Stranger;

public interface StrangerDao {

	/**
	 * 获取未许可人员的信息
	 * @return
	 * @throws SQLException 
	 */
	List<Stranger> getStranger() throws SQLException;
	
	/**
	 * 获取未识别人员的记录数
	 * @return
	 */
	int getCount();
}

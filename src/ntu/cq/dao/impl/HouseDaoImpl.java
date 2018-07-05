package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.House;
import ntu.cq.dao.HouseDao;
import ntu.cq.utils.ConnectionDB;

public class HouseDaoImpl implements HouseDao{

	ConnectionDB db = new ConnectionDB();
	@Override
	public List<House> getHouseList(int Bid) {
		String sql="select * from dbo.House where Bid=?";
		
		return null;
	}

	@Override
	public int getCount(int cid) {
		int count = 0;
		String sql="select count(*) from dbo.House where Bid in(select Bid from dbo.Building where Cid=?)";
		Integer[] params=new Integer[1];
		params[0]=cid;
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		try {
			while (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}

package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ntu.cq.bean.Stranger;
import ntu.cq.dao.StrangerDao;
import ntu.cq.utils.ConnectionDB;
import ntu.cq.utils.ServerAli;

public class StrangerDaoImpl implements StrangerDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public List<Stranger> getStranger() throws SQLException {
		String sql = "select * from dbo.UnpermittedPerson ORDER BY URDate DESC";
		Integer[] params = new Integer[0];
		List<Stranger> list = new ArrayList<Stranger>();
		ResultSet rs = null;
		rs = db.executeQueryRS(sql, params);
		
		while (rs.next()) {
			Stranger stranger = new Stranger();
			stranger.setUPid(rs.getInt("UPid"));
			stranger.setDdid(rs.getInt("Did"));
			stranger.setURDate(rs.getString("URDate"));
			String str = "";
			str += rs.getString("UPPicLocation");
			if (!str.equals("null")) {
				String s = "D:\\AIAC\\UnpermittedFace\\";
				str = str.replace(s, "");
				String urlIp = ServerAli.URLIP;
				String strimg = ServerAli.STRIMG;
				String url = ""+urlIp + strimg + str;
				stranger.setUPPicLocation(url);
				list.add(stranger);
			}

			
		}
		return list;
	}

	@Override
	public int getCount() {
		String sql="select count(*) from dbo.UnpermittedPerson where UPPicLocation IS NOT NULL";
		Integer[] params=new Integer[0];
		int count=0;
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

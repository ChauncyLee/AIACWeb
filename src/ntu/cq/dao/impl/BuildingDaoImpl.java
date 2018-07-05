package ntu.cq.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;
import ntu.cq.dao.BuildingDao;
import ntu.cq.utils.ConnectionDB;

public class BuildingDaoImpl implements BuildingDao {

	ConnectionDB db = new ConnectionDB();

	@Override
	public int getBuildingCount(int Cid) {
		String sql = "select count(*) from dbo.Building where Cid = ? ";
		Integer[] params = new Integer[1];
		params[0] = Cid;
		int bCount = 0;
		bCount = (Integer) db.executeQuerySingle(sql, params);
		if (bCount != 0) {
			return bCount;
		} else
			return 0;
	}

	@Override
	public Building getBuilding(String Bname) throws SQLException {
		String sql = "select Bid,Bcount,Bfloor from dbo.Building where Bname = ? ";
		String s="select count(*) from dbo.House where (dbo.House.Bid = ? and dbo.House.Hstatus != 'U')";
		String[] params = new String[1];
		params[0] = Bname;
		ResultSet rs ;
		Building bd=new Building();
		rs = db.executeQueryRS(sql, params);
		while(rs.next()){
			bd.setBid(rs.getInt("Bid"));
			bd.setBfloor(rs.getInt("Bfloor"));
			bd.setCount(rs.getInt("Bcount"));
		}
		Integer[] par=new Integer[1];
		par[0]=bd.getBid();
		int lCount=(Integer) db.executeQuerySingle(s, par);
		if(lCount>=0)
		bd.setLcount(lCount);
		
		return bd;
	}

	@Override
	public List<House> getBuildingInfo(int Bid) throws SQLException {
		List<House> list=new ArrayList<House>();
		String sql="select * from dbo.House where Bid=? ";
		Integer[] params=new Integer[1];
		params[0]=Bid;
		ResultSet rs=null;
		rs=db.executeQueryRS(sql,params);
		while(rs.next()){
			House house=new House();
			house.setHid(rs.getInt("Hid"));
			house.setHaddr(rs.getString("Haddr").trim());
			house.setHstatus(rs.getString("Hstatus"));
			house.setBid(rs.getInt("Bid"));
			list.add(house);
		}
		return list;
	}

	@Override
	public List<Building> getBname(int Cid) throws SQLException {
		List<Building> list=new ArrayList<Building>();
		
		String sql="select * from dbo.Building where Cid=? ";
		Integer[] params=new Integer[1];
		params[0]=Cid;
		ResultSet rs=null;
		rs=db.executeQueryRS(sql,params);
		while(rs.next()){
			Building bd=new Building();
			bd.setBid(rs.getInt("Bid"));
			bd.setBname(rs.getString("Bname"));
			bd.setBfloor(rs.getInt("Bfloor"));
			list.add(bd);
		}
		return list;
	}

	@Override
	public int addBuilding(Building addBuilding) {
		String sql = "insert into dbo.Building values(?,?,?,?)";
		String[] params=new String[4];
		int flag=0;
		params[0]=addBuilding.getCid()+"";
		params[1]=addBuilding.getBname();
		params[2]=addBuilding.getBfloor()+"";
		params[3]=addBuilding.getCount()+"";
		flag=db.executeUpdate(sql, params);
		return flag;
	}

	@Override
	public int addHouse(List<House> list) {
		String sql = "insert into dbo.House values(?,?,?)";
		String[] params=new String[3];
		int flag=0;
		for(int i=0;i<list.size();i++){
			House h=list.get(i);
			params[0]=h.getHaddr();
			params[1]=h.getBid()+"";
			params[2]=h.getHstatus();
			flag+=db.executeUpdate(sql, params);
		}
		return flag;
	}


}

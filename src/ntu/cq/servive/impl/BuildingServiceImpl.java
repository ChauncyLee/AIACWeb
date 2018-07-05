package ntu.cq.servive.impl;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Building;
import ntu.cq.bean.House;
import ntu.cq.dao.BuildingDao;
import ntu.cq.dao.impl.BuildingDaoImpl;
import ntu.cq.servive.BuildingService;

public class BuildingServiceImpl implements BuildingService {

	private BuildingDao bd=new BuildingDaoImpl(); 
	@Override
	public int getBuildingCount(int Cid) {
		
		return bd.getBuildingCount(Cid);
	}
	@Override
	public Building getBuilding(String Bname) throws SQLException {
		return bd.getBuilding(Bname);
	}
	@Override
	public List<House>  getBuildingInfo(int Bid) throws SQLException {
		return bd.getBuildingInfo(Bid);
	}
	@Override
	public List<Building> getBname(int Cid) throws SQLException {
		// TODO Auto-generated method stub
		return bd.getBname(Cid);
	}
	@Override
	public int addBuilding(Building addBuilding) {
		// TODO Auto-generated method stub
		return bd.addBuilding(addBuilding);
	}
	@Override
	public int addHouse(List<House> list) {
		// TODO Auto-generated method stub
		return bd.addHouse(list);
	}

}

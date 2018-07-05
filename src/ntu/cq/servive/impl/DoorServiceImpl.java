package ntu.cq.servive.impl;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Door;
import ntu.cq.bean.PassInfo;
import ntu.cq.bean.Record;
import ntu.cq.dao.DoorDao;
import ntu.cq.dao.impl.DoorDaoImpl;
import ntu.cq.servive.DoorService;

public class DoorServiceImpl implements DoorService {

	DoorDao d=new DoorDaoImpl();
	@Override
	public List<Door> getDoorInfo(int Cid) throws SQLException {
		return d.getDoorInfo(Cid);
	}
	@Override
	public PassInfo getPassInfo(int Did) {
		return d.getPassInfo(Did);
	}
	@Override
	public int changeDoorStatus(Door door) {
		// TODO Auto-generated method stub
		return d.changeDoorStatus(door);
	}
	@Override
	public Door getDoor(String Dno) throws SQLException {
		// TODO Auto-generated method stub
		return d.getDoor(Dno);
	}
	@Override
	public int addDoor(Door addDoor) {
		// TODO Auto-generated method stub
		return d.addDoor(addDoor);
	}
	@Override
	public List<Record> getRecords(int Rid, String start, String end) throws SQLException {
		// TODO Auto-generated method stub
		return d.getRecords(Rid,start,end);
	}
	@Override
	public List<Record> getResidentRecord(int Did) throws SQLException {
		// TODO Auto-generated method stub
		return d.getResidentRecord(Did);
	}
	@Override
	public List<Record> getDRecords(int Did, String start, String end)
			throws SQLException {
		// TODO Auto-generated method stub
		return d.getDRecords(Did,start,end);
	}
	@Override
	public List<Record> getVisitorRecord(int Did) throws SQLException {
		// TODO Auto-generated method stub
		return d.getVisitorRecord(Did);
	}
	@Override
	public List<Record> getVRecords(int Did, String start, String end)
			throws SQLException {
		// TODO Auto-generated method stub
		return d.getVRecords(Did,start,end);
	}

}

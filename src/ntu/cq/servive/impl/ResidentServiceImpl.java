package ntu.cq.servive.impl;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.dao.ResidentDao;
import ntu.cq.dao.impl.ResidentDaoImpl;
import ntu.cq.servive.ResidentService;

public class ResidentServiceImpl implements ResidentService {

	private ResidentDao rd=new ResidentDaoImpl();
	@Override
	public List<Resident> getResidents(int Hid) throws SQLException {
		return rd.getResidents(Hid);
	}
	@Override
	public Resident getResident(int Rid) throws SQLException {
		// TODO Auto-generated method stub
		return rd.getResident(Rid);
	}
	@Override
	public Visitor getVisitor(int Rid) throws SQLException {
		// TODO Auto-generated method stub
		return rd.getVisitor(Rid);
	}
	@Override
	public int deleteResident(int Rid) {
		// TODO Auto-generated method stub
		return rd.deleteResident(Rid);
	}
	@Override
	public int updateResident(Resident resident) throws SQLException {
		// TODO Auto-generated method stub
		return rd.updateResident(resident);
	}
	@Override
	public List<Resident> getReUnExamine(int cid) throws SQLException {
		// TODO Auto-generated method stub
		return rd.getReUnExamine(cid);
	}
	@Override
	public int comfirm(int id) {
		// TODO Auto-generated method stub
		return rd.comfirm(id);
	}
	@Override
	public int getRecords(String startTime,String endTime,int cid) {
		// TODO Auto-generated method stub
		return rd.getRecords(startTime,endTime,cid);
	}
	@Override
	public int getApplyCount() {
		// TODO Auto-generated method stub
		return rd.getApplyCount();
	}
	@Override
	public int getCount(String hstatus) {
		// TODO Auto-generated method stub
		return rd.getCount(hstatus);
	}

}

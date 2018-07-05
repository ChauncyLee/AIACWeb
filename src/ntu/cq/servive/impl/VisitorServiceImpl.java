package ntu.cq.servive.impl;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Visitor;
import ntu.cq.dao.VisitorDao;
import ntu.cq.dao.impl.VisitorDaoImpl;
import ntu.cq.servive.VisitorService;

public class VisitorServiceImpl implements VisitorService {

	private VisitorDao vd=new VisitorDaoImpl();
	@Override
	public List<Visitor> getVisitor(int Hid) throws SQLException {
		// TODO Auto-generated method stub
		return vd.getVisitor(Hid);
	}
	@Override
	public List<Visitor> getViUnExamine(int cid) throws SQLException {
		// TODO Auto-generated method stub
		return vd.getViUnExamine(cid);
	}
	@Override
	public int comfirm(int id) {
		// TODO Auto-generated method stub
		return vd.comfirm(id);
	}
	@Override
	public int getRecords(String startTime,String endTime,int cid) {
		// TODO Auto-generated method stub
		return vd.getRecords(startTime,endTime,cid);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return vd.getCount();
	}
	@Override
	public int getApplyCount() {
		// TODO Auto-generated method stub
		return vd.getApplyCount();
	}

}

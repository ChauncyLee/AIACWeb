package ntu.cq.servive.impl;

import java.sql.SQLException;
import java.util.List;

import ntu.cq.bean.Stranger;
import ntu.cq.dao.StrangerDao;
import ntu.cq.dao.impl.StrangerDaoImpl;
import ntu.cq.servive.StrangerService;

public class StrangerServiceImpl implements StrangerService {

	StrangerDao sd=new StrangerDaoImpl();
	@Override
	public List<Stranger> getStranger() throws SQLException {
		// TODO Auto-generated method stub
		return sd.getStranger();
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return sd.getCount();
	}

}

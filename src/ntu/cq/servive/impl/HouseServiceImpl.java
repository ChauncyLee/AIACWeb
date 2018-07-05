package ntu.cq.servive.impl;

import java.util.List;

import ntu.cq.bean.House;
import ntu.cq.dao.HouseDao;
import ntu.cq.dao.impl.HouseDaoImpl;
import ntu.cq.servive.HouseService;

public class HouseServiceImpl implements HouseService {

	private HouseDao hd=new HouseDaoImpl();
	
	@Override
	public List<House> getHouseList(int Bid) {
		return hd.getHouseList(Bid);
	}

	@Override
	public int getCount(int cid) {
		// TODO Auto-generated method stub
		return hd.getCount(cid);
	}

}

package ntu.cq.servive;

import java.util.List;

import ntu.cq.bean.House;

public interface HouseService {
	
	/**
	 * 根据楼号Bid获取该楼栋的所有住户
	 * @param Bid
	 * @return
	 */
	List<House> getHouseList(int Bid);
	
	/**
	 * 获取房屋的总数
	 * @param cid
	 * @return
	 */
	int getCount(int cid);
}

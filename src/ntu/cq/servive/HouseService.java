package ntu.cq.servive;

import java.util.List;

import ntu.cq.bean.House;

public interface HouseService {
	
	/**
	 * ����¥��Bid��ȡ��¥��������ס��
	 * @param Bid
	 * @return
	 */
	List<House> getHouseList(int Bid);
	
	/**
	 * ��ȡ���ݵ�����
	 * @param cid
	 * @return
	 */
	int getCount(int cid);
}

package ntu.cq.servive.impl;

import ntu.cq.dao.UploadDao;
import ntu.cq.dao.impl.UploadDaoImpl;
import ntu.cq.servive.UploadService;

public class UploadServiceImpl implements UploadService {

	private UploadDao up=new UploadDaoImpl();
	
	@Override
	public int getUid(String uname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addUidResident(int Uid, int Rid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addUidVisitor(int Uid, int Vid) {
		// TODO Auto-generated method stub
		return 0;
	}

}

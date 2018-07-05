package ntu.cq.servive;

public interface UploadService {
	
	/**
	 * 由uname获取该用户的Uid
	 * @param uname
	 * @return
	 */
	int getUid(String uname);
	
	/**
	 * 根据Rid将Uid查到该用户的表中
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidResident(int Uid,int Rid);
	/**
	 * 根据Vid将Uid查到该用户的表中
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidVisitor(int Uid,int Vid);

}

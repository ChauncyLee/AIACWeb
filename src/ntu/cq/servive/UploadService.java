package ntu.cq.servive;

public interface UploadService {
	
	/**
	 * ��uname��ȡ���û���Uid
	 * @param uname
	 * @return
	 */
	int getUid(String uname);
	
	/**
	 * ����Rid��Uid�鵽���û��ı���
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidResident(int Uid,int Rid);
	/**
	 * ����Vid��Uid�鵽���û��ı���
	 * @param Uid
	 * @param Rid
	 * @return
	 */
	int addUidVisitor(int Uid,int Vid);

}

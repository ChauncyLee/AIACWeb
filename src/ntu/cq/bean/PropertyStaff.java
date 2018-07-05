package ntu.cq.bean;

public class PropertyStaff {

	private int Pid;
	private String Pname;
	private String Pgender;
	private String Pstaffno;
	private String Ptel;
	private int RRid;
	private String Pusername;
	private String Password;
	private int Cid;

	
	
	public PropertyStaff(int pid, String pname, String pgender,
			String pstaffno, String ptel, int rRid, String pusername,
			String ppassword) {
		super();
		Pid = pid;
		Pname = pname;
		Pgender = pgender;
		Pstaffno = pstaffno;
		Ptel = ptel;
		RRid = rRid;
		Pusername = pusername;
	}
	public PropertyStaff() {
		super();
		Pid = 0;
		Pname = "";
		Pgender = "";
		Pstaffno = "";
		Ptel = "";
		RRid = 0;
		Pusername = "";
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPgender() {
		return Pgender;
	}
	public void setPgender(String pgender) {
		Pgender = pgender;
	}
	public String getPstaffno() {
		return Pstaffno;
	}
	public void setPstaffno(String pstaffno) {
		Pstaffno = pstaffno;
	}
	public String getPtel() {
		return Ptel;
	}
	public void setPtel(String ptel) {
		Ptel = ptel;
	}
	public int getRRid() {
		return RRid;
	}
	public void setRRid(int rRid) {
		RRid = rRid;
	}
	public String getUsername() {
		return Pusername;
	}
	public void setUsername(String username) {
		this.Pusername = username;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
}

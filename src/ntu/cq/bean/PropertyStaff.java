package ntu.cq.bean;

public class PropertyStaff {

	private String Pid;
	private String Pname;
	private String Pgender;
	private String Pstaffno;
	private String Ptel;
	private String RRid;
	private String Pusername;
	private String Ppassword;

	
	
	public PropertyStaff(String pid, String pname, String pgender,
			String pstaffno, String ptel, String rRid, String pusername,
			String ppassword) {
		super();
		Pid = pid;
		Pname = pname;
		Pgender = pgender;
		Pstaffno = pstaffno;
		Ptel = ptel;
		RRid = rRid;
		Pusername = pusername;
		Ppassword = ppassword;
	}
	public PropertyStaff() {
		super();
		Pid = "";
		Pname = "";
		Pgender = "";
		Pstaffno = "";
		Ptel = "";
		RRid = "";
		Pusername = "";
		Ppassword = "";
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
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
	public String getRRid() {
		return RRid;
	}
	public void setRRid(String rRid) {
		RRid = rRid;
	}
	public String getUsername() {
		return Pusername;
	}
	public void setUsername(String username) {
		this.Pusername = username;
	}
	public String getPassword() {
		return Ppassword;
	}
	public void setPassword(String password) {
		this.Ppassword = password;
	}
	
	
	
	
}

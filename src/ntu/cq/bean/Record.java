package ntu.cq.bean;

public class Record {
	private int id;
	private int Vid;
	private int Did;
	private int RDid;
	private int VDid;
	private String name;
	private String datetm;
	private String Ddir;
	private String Dno;
	private String color;
	private String pic;
	private String role;
	private String info;
	
	public int getId() {
		return id;
	}
	public void setId(int rid) {
		id = rid;
	}
	public int getDid() {
		return Did;
	}
	public void setDid(int did) {
		Did = did;
	}
	public int getRDid() {
		return RDid;
	}
	public void setRDid(int rDid) {
		RDid = rDid;
	}
	public String getName() {
		return name;
	}
	public void setName(String rname) {
		name = rname;
	}
	public String getDate() {
		return datetm;
	}
	public void setDate(String rDDate) {
		datetm = rDDate;
	}
	public String getDdir() {
		return Ddir;
	}
	public void setDdir(String ddir) {
		Ddir = ddir;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	public int getVDid() {
		return VDid;
	}
	public void setVDid(int vDid) {
		VDid = vDid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}

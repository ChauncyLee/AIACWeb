package ntu.cq.bean;

public class Building {
	private int Bid;
	private int Cid;
	private String Bname;
	private int Bfloor;
	private int Lcount;
	private int count;
	
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getBfloor() {
		return Bfloor;
	}
	public void setBfloor(int bfloor) {
		Bfloor = bfloor;
	}
	public int getLcount() {
		return Lcount;
	}
	public void setLcount(int lcount) {
		Lcount = lcount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}

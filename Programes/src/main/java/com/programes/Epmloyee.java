package com.programes;

public class Epmloyee {

	private int eid;
	private String ename;
	private String departmaent;

	private String address;
	private String mobileNumber;
	
	
	
	
	public Epmloyee(int eid, String ename, String departmaent, String address, String mobileNumber) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.departmaent = departmaent;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepartmaent() {
		return departmaent;
	}
	public void setDepartmaent(String departmaent) {
		this.departmaent = departmaent;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Epmloyee [eid=" + eid + ", ename=" + ename + ", departmaent=" + departmaent + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	

}

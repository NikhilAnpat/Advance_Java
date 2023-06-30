package com.demo.beans;

public class MyUser 
{
	private int uid;
	private String uname;
	private String uemail;
	
	public MyUser()
	{
		super();
	}

	public MyUser(int uid, String uname, String uemail) 
	{
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + "]";
	}
	
	
}

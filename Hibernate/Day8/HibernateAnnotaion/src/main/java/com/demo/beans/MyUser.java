package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//to allow creation of entity entry in the table
@Entity
//to specify table name otherwise a table with claas namme will get created
@Table(name = "myuser22")
public class MyUser 
{
	  @Id  // it will make the column as primary key
	  @GeneratedValue(strategy=GenerationType.IDENTITY)//Auto generate
	  @Column(name="id")
	  
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

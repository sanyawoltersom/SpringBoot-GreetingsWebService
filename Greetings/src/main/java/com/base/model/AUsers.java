package com.base.model;

import javax.persistence.*;


@Entity
public class AUsers {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String uname;
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
	@Override
	public String toString() {
		return "AUsers [uid=" + uid + ", uname=" + uname + "]";
	}
	

}

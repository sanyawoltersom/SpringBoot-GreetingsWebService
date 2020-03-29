package com.base.model;

import javax.persistence.*;


@Entity
public class AUsers {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String uname;
	private String tech;
	
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "AUsers [uid=" + uid + ", uname=" + uname + "]";
	}
	

}

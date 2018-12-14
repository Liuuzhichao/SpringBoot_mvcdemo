package com.liuzhichao.mvcdemo.entity;

import java.util.List;

public class Dept {
	private Integer did;
	private String dname;
	private List<User> users;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dept(Integer did, String dname, List<User> users) {
		super();
		this.did = did;
		this.dname = dname;
		this.users = users;
	}
	
	public Integer getDid() {
		return did;
	}
	
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", users=" + users + "]";
	}
	
}

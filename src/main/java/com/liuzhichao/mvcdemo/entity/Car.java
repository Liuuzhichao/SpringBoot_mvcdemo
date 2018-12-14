package com.liuzhichao.mvcdemo.entity;

public class Car {
	private Integer cid;
	private String brand;
	private String color;
	private User user;
	
	public Car() {
		super();
	}

	public Car(Integer cid, String brand, String color, User user) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.color = color;
		this.user = user;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", brand=" + brand + ", color=" + color + ", user=" + user + "]";
	}
	
}

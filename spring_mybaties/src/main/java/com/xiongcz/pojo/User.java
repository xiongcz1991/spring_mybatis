package com.xiongcz.pojo;

public class User {
	private String name;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User:"+"{"+
				"name:"+name+" "+
				"country:"+country+
				"}";
	}
}

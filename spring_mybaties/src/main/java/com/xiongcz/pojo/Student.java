package com.xiongcz.pojo;

import java.util.List;

public class Student {
	private int id ;
	private String name ; 
	private String password ;
	private List<String> hobbies ;
	private boolean isman ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public boolean isIsman() {
		return isman;
	}
	public void setIsman(boolean isman) {
		this.isman = isman;
	}
	public Student(int id, String name, String password, List<String> hobbies, boolean isman) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.hobbies = hobbies;
		this.isman = isman;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", hobbies=" + hobbies + ", isman="
				+ isman + "]";
	}
	
	
}

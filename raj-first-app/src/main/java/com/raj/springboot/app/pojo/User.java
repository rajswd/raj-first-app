package com.raj.springboot.app.pojo;

public class User {
	private Integer id;
	private String f_name;
	private String l_name;
	private String location;
	private boolean isActive;
	
	public User(Integer id, String f_name, String l_name, String location, boolean active )   
	{  
		super();  
		this.id = id;  
		this.f_name = f_name;  
		this.l_name = l_name; 
		this.location = location;
		this.isActive = active;
	}  

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
}

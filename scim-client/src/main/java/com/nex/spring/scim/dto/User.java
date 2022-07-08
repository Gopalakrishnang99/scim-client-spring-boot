package com.nex.spring.scim.dto;

public class User {
	
	String name;
	String title;
	
	public User(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", title=" + title + "]";
	}
		

}

package com.caijia.advancedmvc.bean;

import com.caijia.advancedmvc.controller.School;

public class User {
	private long id;
	private String name;
	private boolean isManager;

	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

}

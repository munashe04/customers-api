package com.example.demo;

import java.util.UUID;

public class Customers {
	
	
	private String username;
	private UUID id;
	
	public Customers() {};
	
	public Customers(String username, UUID id) {
		super();
		this.username = username;
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
}

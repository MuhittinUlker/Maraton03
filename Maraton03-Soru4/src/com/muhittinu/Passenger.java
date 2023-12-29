package com.muhittinu;

import java.util.UUID;

public class Passenger {

	private String name;

	public Passenger() {
		
		this.name = UUID.randomUUID().toString().substring(0,5);
	}

	public String getName() {
		return name;
	}
	
}

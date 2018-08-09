package com.sikri.grocery.domain;

public class Customer {

	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return (this.firstName + " " + this.lastName);
	}
	
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

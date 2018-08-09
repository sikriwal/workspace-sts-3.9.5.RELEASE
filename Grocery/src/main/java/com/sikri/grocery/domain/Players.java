package com.sikri.grocery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Players {
	@Id @GeneratedValue
	Long id;
	
	
	String fullname ;
	String fposition;
	
	public String getfullName() {
		return fullname;
	}

	public void setfullName(String name) {
		this.fullname = name;
	}

	public String getfPosition() {
		return fposition;
	}

	public void setfPosition(String position) {
		this.fposition = position;
	}

	public Players() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	public Players( String name, String position)
	{ this.fullname = name;
	  this.fposition = position;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

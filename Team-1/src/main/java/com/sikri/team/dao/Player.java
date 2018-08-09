package com.sikri.team.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Player {

	@Id
	@GeneratedValue
	Long id;
	
private String name;
private String position;

@ManyToOne
private Team team;
public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team; ;
}
private Player() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	
}

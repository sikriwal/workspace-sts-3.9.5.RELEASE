package com.sikri.team.dao;

import java.util.Set;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Team {
private String name;
private String location;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="cteam")
private Set<ChildTeam> cteam;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="pteam")
private Set<Player> pteam;

public Set<Player> getPteam() {
	return pteam;
}



public void setPteam(Set<Player> pteam) {
	this.pteam = pteam;
}

@Id 
@GeneratedValue
Long id;

/* @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Player.class)
@JoinColumn(name="teamid")
private Set<Player> players; */




	private Team() {
		// TODO Auto-generated constructor stub
	}

	
	
/*	public Team(String name, String location, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
	} */
	
	

	public Team(String name, String location, Set<ChildTeam>cteam, Set<Player>pteam) {
		super();
		this.name = name;
		this.location = location;
		this.cteam = cteam;
		this.pteam = pteam;
		
	}

	public Set<ChildTeam> getCteam() {
		return cteam;
	}

	public void setCteam(Set<ChildTeam> cteam) {
		this.cteam = cteam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

/*	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	} */
	



}

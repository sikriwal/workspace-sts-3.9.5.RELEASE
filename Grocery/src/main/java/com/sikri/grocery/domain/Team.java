package com.sikri.grocery.domain;

import java.util.Set;


import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@XmlRootElement

@Entity
@Table(name="team")
public class Team {

	public Team() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Id @GeneratedValue
	Long id;
	String name;
	String location;
	String mascot;
	
	//@OneToMany(cascade=CascadeType.ALL) @JoinColumn(name="teamId")
	//Set<Players>players;
	
	   @OneToMany(
		        mappedBy = "team", 
		        cascade = CascadeType.ALL, 
		        orphanRemoval = true
		    )
	Set<Member> member;
	
	/*public Team( String location, String name, Set<Players> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
	} */
	
	public Team( String location, String name, Set<Member> member) {
		super();
		this.name = name;
		this.location = location;
		this.member = member;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Set<Member> getMember() {
		return member;
	}

	public void setMember(Set<Member> member) {
		this.member = member;
	}

	public Team( String location, String name) {
		super();
		this.name = name;
		this.location = location;

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


	public String getMascot() {
		return mascot;
	}


	public void setMascot(String mascot) {
		this.mascot = mascot;
	}


   /* public Set<Players> getPlayers() {
		return players;
	}*/


   /* public void setPlayers(Set<Players> players) {
		this.players = players;
	} */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

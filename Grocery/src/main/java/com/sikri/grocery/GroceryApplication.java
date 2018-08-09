package com.sikri.grocery;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sikri.grocery.dao.TeamDAO;
import com.sikri.grocery.domain.Member;
import com.sikri.grocery.domain.Players;
import com.sikri.grocery.domain.Team;

@SpringBootApplication
public class GroceryApplication {

	private Team team;
	
	@Autowired
	TeamDAO teamDao;
	public static void main(String[] args) {
		SpringApplication.run(GroceryApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
	/*Set<Players> players = new HashSet<Players>();
	players.add(new Players("Vishal Singh", "pitcher"));
	players.add(new Players("Aahan Singh", "shortstop"));
	
	team = new Team("California", "Angels", players);
	//team = new Team("India", "Test");*/
	Set<com.sikri.grocery.domain.Member> member = new HashSet<>();
	member.add(new Member());
	team = new Team("California", "Angels", member);
	//teamDao.saveAll((Iterable<S>) team);
	}
	

}


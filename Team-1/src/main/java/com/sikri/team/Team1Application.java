package com.sikri.team;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sikri.team.dao.ChildTeam;
import com.sikri.team.dao.Player;
import com.sikri.team.dao.PlayerDAO;
import com.sikri.team.dao.Team;
import com.sikri.team.dao.TeamDAO;

@SpringBootApplication
public class Team1Application {
	
	
	 @Autowired
	private TeamDAO teamDao; 
	
	@Autowired
	private PlayerDAO playerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Team1Application.class, args);
	}

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Vishal", "hitter"));
		players.add(new Player("Aahan", "pitcher"));
	    //playerDao.saveAll(players);
		
	    Set<ChildTeam> cteam  = new HashSet<>();
	    cteam.add(new ChildTeam("Mumbai"));
	    cteam.add(new ChildTeam("Delhi"));
		
	    
		Team team = new Team( "Heat", "Miami", cteam, players);
		teamDao.save(team); 
	}
	
	
	
	
}

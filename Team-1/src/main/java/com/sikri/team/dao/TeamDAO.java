package com.sikri.team.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource(path="xteam", rel="xteam")
public interface TeamDAO extends CrudRepository<Team, Long> {


	
	List<Team> findAll();
//	List<Player>findByPteam();
//	List<ChildTeam>findByCteam();
//	List<ChildTeam>findAllChildTeam();
	//Team findByName(String name);
	//Team findByLocation(String name);
}

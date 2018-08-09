package com.sikri.team.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ChildTeamDAO extends CrudRepository<ChildTeam, Long> {

	List<ChildTeam> findAll();
	
	ChildTeam findByChildname(String name);
	List<ChildTeam> findByTeam(Team name);
}

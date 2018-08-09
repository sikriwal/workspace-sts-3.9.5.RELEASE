package com.sikri.team.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlayerDAO extends CrudRepository<Player, Long> {

	List<Player> findAll();
	Player findByName(String name);
	Player findByPosition(String name);
}

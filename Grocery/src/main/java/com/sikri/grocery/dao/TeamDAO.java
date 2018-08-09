package com.sikri.grocery.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.sikri.grocery.domain.Team;

import com.sikri.grocery.domain.*;
@Component
public interface TeamDAO extends CrudRepository<Member, Long>  {
	
	List<Member> findAll();
	
	//Team findByName(String name);
	
		
}

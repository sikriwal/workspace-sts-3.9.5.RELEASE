package com.sikri.grocery;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sikri.grocery.domain.Players;
import com.sikri.grocery.domain.Team;

@Controller

public class RestController {
private  Team team;
	public RestController() {
		// TODO Auto-generated constructor stub
	}


/*@RequestMapping("/hello")
public @ResponseBody Team hello() {
	return team;
}*/

}
package com.sikri.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

	@Value("${myname}")
	String luckyWord;
	
	@GetMapping("/myname")
	public String getConfig() {
		return	"The config is" +  luckyWord;

}
	}

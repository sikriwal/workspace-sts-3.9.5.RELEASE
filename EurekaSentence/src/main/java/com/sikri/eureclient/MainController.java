package com.sikri.eureclient;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@EnableDiscoveryClient
@EnableAutoConfiguration


public class MainController {

	
	@Autowired
	private org.springframework.cloud.client.discovery.DiscoveryClient client;
	
	
	
	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/sentence")
	  public @ResponseBody String getSentence() {
	//	String test = "getName(\"EUREKACLIENT1\")";
	//    return 
	//      discoverService(test);
		return getWord("EUREKACLIENT");// + 
			//	" TEST " + getWord("EUREKACLIENT")  + " "
	        //   + getWord("EUREKACLIENT1");
	  }
	  
	
	/*public String discoverService(String svc) {
		String service = parse(svc);
	    List<ServiceInstance> list = client.getInstances(service);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(uri,String.class);
	  }
	    }
	    return null;
	  }
	
	
	private String parse(String svc) {
		StringBuffer mysvc = new StringBuffer(svc);
		int start = mysvc.indexOf("(");
		int end  = mysvc.indexOf(")");
		System.out.println(svc.substring(start+1, end));
		return ( svc.substring(start+1, end));
	} */
	
	
	public String getWord(String service) {
	    List<ServiceInstance> list = client.getInstances(service);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(uri,String.class);
	  }
	    }
	    return null;
	  }
	   
	public String getName(String service) {
	    List<ServiceInstance> list = client.getInstances(service);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	     URI testuri =  uri.resolve("/name");
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(testuri,String.class);
	  }
	    }
	    return null;
	  } 
	
	     
}

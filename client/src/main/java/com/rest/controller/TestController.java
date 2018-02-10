package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RefreshScope
@RestController
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/getNewMessage")
	public String getNewMessage(){
		System.out.println("inside rest call");
		String message = restTemplate.getForObject("http://test-client/getMessage", String.class);
		return message+ " Vigggg";
	}

}

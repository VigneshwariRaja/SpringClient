package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	@Value("${test.message}")
	public String message;
	
	@RequestMapping("/getMessage")
	public String getMessgae(){
		return message;
	}

}

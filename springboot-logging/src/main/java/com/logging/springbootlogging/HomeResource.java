package com.logging.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource { 
	
	//Now to perfom logging in java using slf4j , we have a standard method called getLogger() that we can use.
	Logger logger = LoggerFactory.getLogger(HomeResource.class);
	
	@RequestMapping("/hello")
	public String hello()
	{
		//logger.error("error happened!");
		logger.trace("home method accessed");
		return "hello from spring boot";
	}

}

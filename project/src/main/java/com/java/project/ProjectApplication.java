package com.java.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.project.soap.api.CreateUser.GetUserRequest;
import com.java.project.soap.api.CreateUser.GetUserResponse;
import com.java.project.soap.api.client.SoapClient;

@SpringBootApplication
@RestController
public class ProjectApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectApplication.class);
	
	@Autowired
	private SoapClient client;
	
	@PostMapping("/getUser")
	public GetUserResponse invokeSoapGetUser(@RequestBody GetUserRequest request) {
		return client.getUserResponse(request);
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		LOGGER.error("Message logged at ERROR level");
		LOGGER.warn("Message logged at WARN level");
		LOGGER.info("Message logged at INFO level");
		LOGGER.debug("Message logged at DEBUG level");
	}

}
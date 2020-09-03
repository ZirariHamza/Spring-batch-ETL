package com.java.soap.api.endpoint;

import org.example.createentity.InsertionRequest;
import org.example.createentity.InsertionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.java.soap.api.service.VerificationService;

@Endpoint
public class CreationEndPoint {

	private static final String NAMESPACE="http://www.example.org/CreateEntity";
	
	@Autowired
	private VerificationService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "InsertionRequest")
	@ResponsePayload
	public InsertionResponse getResponseStatus(@RequestPayload InsertionRequest request) {
		System.out.println("You are ine endpoint now");
		return service.checkInsert(request);
	}
}

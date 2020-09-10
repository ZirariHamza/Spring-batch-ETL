package com.java.project.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.java.project.soap.api.CreateUser.InsertionRequest;
import com.java.project.soap.api.CreateUser.InsertionResponse;

@Service
public class SoapClient {

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public InsertionResponse getCreationStatus(InsertionRequest request) {
		template = new WebServiceTemplate(marshaller);
		InsertionResponse response = (InsertionResponse) template.marshalSendAndReceive("http://localhost:8080/ws", request);
		return response;
	}
}

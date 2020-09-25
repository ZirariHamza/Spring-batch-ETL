package com.java.project.batch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.api.CreateUser.InsertionResponse;
import com.java.project.api.client.SoapClient;
import com.java.project.model.Logs;
import com.java.project.model.Client;
import com.java.project.repository.LogRepository;

@Component
public class Processor implements ItemProcessor<Client, Client>{

	@Autowired
	private LogRepository logRepository;
	
	@Autowired
	private SoapClient soapClient;
	
	
	@Override
	public Client process(Client Client){
		InsertionResponse response = new InsertionResponse();
		response = soapClient.getResponse(Client.getFirstName(), Client.getLastName(), Client.getBankCode());
		if(response.isIsCreated() == true){
			return Client;
		}else {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			Logs log = new Logs(dtf.format(now).toString(), Client.toString());
			logRepository.save(log);
			return null;
		}
	}

}

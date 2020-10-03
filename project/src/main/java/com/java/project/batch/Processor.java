package com.java.project.batch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.api.CreateUser.InsertionResponse;
import com.java.project.api.client.SoapClient;
import com.java.project.dao.ClientRepository;
import com.java.project.dao.LogRepository;
import com.java.project.model.Logs;
import com.java.project.model.Client;

@Component
public class Processor implements ItemProcessor<Client, Client>{

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private LogRepository logRepository;
	
	@Autowired
	private SoapClient soapClient;
	
	private static final Map<String, String> ACC_TYPES = new HashMap<>();
	
	public Processor() {
		ACC_TYPES.put("001", "Compte 200");
		ACC_TYPES.put("002", "Compte 5000");
		ACC_TYPES.put("003", "Compte 20000");
		ACC_TYPES.put("004", "Compte particulier");
		ACC_TYPES.put("006", "Compte");
	}
	
	@Override
	public Client process(Client Client){
		InsertionResponse response = new InsertionResponse();
		response = soapClient.getResponse(Client.getAccountType(), Client.getFirstName(), Client.getLastName(), Client.getBankCode(),
				Client.getAdress(), Client.getPhoneNumber(), Client.getCountry(), Client.getCity(), Client.getEmail());
		if(response.isIsCreated() == true) {
			String accCode = Client.getAccountType();
			String accountType = ACC_TYPES.get(accCode);
			Client.setAccountType(accountType);
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

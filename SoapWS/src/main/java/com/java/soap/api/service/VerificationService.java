package com.java.soap.api.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.example.createentity.InsertionRequest;
import org.example.createentity.InsertionResponse;
import org.springframework.stereotype.Service;

@Service
public class VerificationService {

	private String regex1 = "^[a-zA-Z]*$";
	private String regex2 = "^[a-zA-Z0-9]{6}$";
	
	public InsertionResponse checkInsert(InsertionRequest request) {
		InsertionResponse response = new InsertionResponse();

		Pattern pt1 = Pattern.compile(regex1);
		Pattern pt2 = Pattern.compile(regex2);
		Matcher mt1 = pt1.matcher(request.getClientFirstName());
		Matcher mt2 = pt1.matcher(request.getClientLastName());
		Matcher mt3 = pt2.matcher(request.getClientBankCode());
		if(mt1.matches() == false || mt2.matches() == false || mt3.matches() == false) {
			System.out.println(mt1.matches() + " and " + mt2.matches() + " and " + mt3.matches());
			response.setIsCreated(false);
		}else if(mt1.matches() == true && mt2.matches() == true && mt3.matches() == true) {
			System.out.println(mt1.matches() + " and " + mt2.matches() + " and " + mt3.matches());
			response.setIsCreated(true);
		}
		
		return response;
	}
}

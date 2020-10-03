package com.java.soap.api.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.example.createentity.InsertionRequest;
import org.example.createentity.InsertionResponse;
import org.springframework.stereotype.Service;

@Service
public class VerificationService {

	private String regexAccountType = "00([1-4]|6)";
	private String regexBankCode = "[a-zA-Z0-9]{8,11}";
	private String regexPhoneNumber = "\\+[0-9]{1,3}\\s[0-9]{3,14}";
	private String regexAdresse = "[a-zA-Z0-9]* [a-zA-Z ]*";
	private String regexCapital = "[A-Z][a-z]*( [A-Z][a-z]*)?";
	private String regexEmail = "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
	
	public InsertionResponse checkInsert(InsertionRequest request) {
		InsertionResponse response = new InsertionResponse();

		Pattern ptAccountType= Pattern.compile(regexAccountType);
		Pattern ptBankCode = Pattern.compile(regexBankCode);
		Pattern ptPhoneNumber = Pattern.compile(regexPhoneNumber);
		Pattern ptCapital = Pattern.compile(regexCapital);
		Pattern ptEmail = Pattern.compile(regexEmail);
		Pattern ptAdresse = Pattern.compile(regexAdresse);
		Matcher mtAccountType = ptAccountType.matcher(request.getClientAccountType());
		Matcher mtFirstName = ptCapital.matcher(request.getClientFirstName());
		Matcher mtLastName = ptCapital.matcher(request.getClientLastName());
		Matcher mtBankCode = ptBankCode.matcher(request.getClientBankCode());
		Matcher mtPhoneNumber = ptPhoneNumber.matcher(request.getClientPhoneNumber());
		Matcher mtCountry = ptCapital.matcher(request.getClientCountry());
		Matcher mtCity = ptCapital.matcher(request.getClientCity());
		Matcher mtAdresse = ptAdresse.matcher(request.getClientAddress());
		Matcher mtEmail = ptEmail.matcher(request.getClientEmail());
		if(mtFirstName.matches() == false || mtLastName.matches() == false || mtAccountType.matches() == false
				|| mtPhoneNumber.matches() == false || mtBankCode.matches() == false || mtCountry.matches() == false
				|| mtCity.matches() == false || mtAdresse.matches() == false || mtEmail.matches() == false) {
			response.setIsCreated(false);
		}else if(mtFirstName.matches() == true && mtLastName.matches() == true && mtAccountType.matches() == true
				&& mtPhoneNumber.matches() == true && mtBankCode.matches() == true && mtCountry.matches() == true
				&& mtCity.matches() == true && mtAdresse.matches() == true && mtEmail.matches() == true) {
			response.setIsCreated(true);
		}
		return response;
	}
}
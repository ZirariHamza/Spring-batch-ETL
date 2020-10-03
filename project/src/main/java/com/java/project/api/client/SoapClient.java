package com.java.project.api.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.java.project.api.CreateUser.InsertionRequest;
import com.java.project.api.CreateUser.InsertionResponse;

public class SoapClient extends WebServiceGatewaySupport {

  public InsertionResponse getResponse(String accountType, String firstName, String lastName, String bankCode
		  , String adress, String phoneNumber
		  , String country, String city, String email) {

    InsertionRequest request = new InsertionRequest();
    request.setClientFirstName(firstName);
    request.setClientLastName(lastName);
    request.setClientBankCode(bankCode);
    request.setClientAccountType(accountType);
    request.setClientAddress(adress);
    request.setClientPhoneNumber(phoneNumber);
    request.setClientCountry(country);
    request.setClientCity(city);
    request.setClientEmail(email);

    InsertionResponse response = (InsertionResponse) getWebServiceTemplate()
        .marshalSendAndReceive("http://localhost:8080/ws", request);

    return response;
  }

}

package com.java.project.api.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.java.project.api.CreateUser.InsertionRequest;
import com.java.project.api.CreateUser.InsertionResponse;

public class SoapClient extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

  public InsertionResponse getResponse(String firstName, String lastName, String bankCode) {

    InsertionRequest request = new InsertionRequest();
    request.setClientFirstName(firstName);
    request.setClientLastName(lastName);
    request.setClientBankCode(bankCode);

    log.info("Requesting location for " + firstName);
    log.info("Requesting location for " + lastName);
    log.info("Requesting location for " + bankCode);

    InsertionResponse response = (InsertionResponse) getWebServiceTemplate()
        .marshalSendAndReceive("http://localhost:8080/ws", request);

    return response;
  }

}

package com.financeInfo.finance.service;

import com.financeInfo.finance.model.EmployeeFinanceResponse;
import com.financeInfo.finance.model.EmployeeInformationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FinanceService {
   /* @Autowired
    RestTemplate restTemplate;*/
   RestTemplate restTemplate = new RestTemplate();

    public EmployeeFinanceResponse getEmployeeFinanceResponse(){
        String url ="http://localhost:8080/amEmployee";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<?> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<EmployeeFinanceResponse> response = null ;
        try{
            response =restTemplate.exchange(url, HttpMethod.GET,httpEntity, EmployeeFinanceResponse.class);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

return  response.getBody();
    }
}

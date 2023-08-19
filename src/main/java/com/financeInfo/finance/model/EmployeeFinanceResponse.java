package com.financeInfo.finance.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class EmployeeFinanceResponse {
    String status ;
    List<EmployeeInformationRequest> data = new ArrayList<>();
    String message;

}

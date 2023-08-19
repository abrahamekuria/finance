package com.financeInfo.finance.controller;

import com.financeInfo.finance.model.EmployeeFinanceResponse;
import com.financeInfo.finance.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {
    @Autowired
    FinanceService financeService;
    @GetMapping("/finance")
    public EmployeeFinanceResponse getEmpInfo(){
        return financeService.getEmployeeFinanceResponse();
    }
}

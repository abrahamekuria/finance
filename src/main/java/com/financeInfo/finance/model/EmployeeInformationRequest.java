package com.financeInfo.finance.model;


import lombok.Data;

@Data

public class EmployeeInformationRequest {
    int id;
    String employee_name;
    int employee_salary;
    int employee_age;
    String profile_image;
}

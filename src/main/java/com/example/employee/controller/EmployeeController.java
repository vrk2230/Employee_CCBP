package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeH2Service;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeH2Service empService;

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return empService.getEmp();
    }

}
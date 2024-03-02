package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.employee.model.Employee;
import com.example.employee.model.EmployeeRowMapper;
import com.example.employee.repository.EmployeeRepository;

import java.util.*;

@Service
public class EmployeeH2Service implements EmployeeRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Employee> getEmp() {
        return (ArrayList<Employee>) db.query("SELECT * FROM EMPLOYEELIST", new EmployeeRowMapper());
    }

    @Override
    public Employee addEmp(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmpById(int empId) {
        return null;
    }

    @Override
    public Employee updateEmp(int empId, Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(int empId) {

    }

}
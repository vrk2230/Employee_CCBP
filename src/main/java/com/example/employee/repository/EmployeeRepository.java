package com.example.employee.repository;

import java.util.ArrayList;

import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getEmp();

    Employee addEmp(Employee employee);

    Employee getEmpById(int empId);

    Employee updateEmp(int empId, Employee employee);

    void deleteEmployee(int empId);
}
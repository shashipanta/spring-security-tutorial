package com.example.apitutorial.service;

import com.example.apitutorial.domain.Employee;

import java.util.List;

public interface EmployeeService {

    // add Employee
    Employee addEmployee(Employee employee);

    // get all employees
    List<Employee> getAllEmployees();

    // find employee
    Employee findById(Integer id);

    // update employee
    Employee updateEmployee(Employee employee);

    // delete employee
    Boolean deleteById(Integer id);

}

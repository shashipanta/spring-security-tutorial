package com.example.apitutorial.repository;

import com.example.apitutorial.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository {
    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1, "shashi", "panta", "shashi@tomail.com"));
        DATABASE.add(new Employee(2, "manish", "pudasaini", "manish@gmail.com"));
        DATABASE.add(new Employee(3, "samir", "bhandari", "bhandarisamir@yahoo.com"));

    }

    public Employee addEmployee(Employee employee) {
        DATABASE.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return DATABASE;
    }

    public Employee findById(Integer id) {
        return DATABASE.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public Employee updateEmployee(Employee employee) {
        Integer empId = DATABASE.stream()
                .filter(emp -> emp.getId().equals(employee.getId()))
                .findFirst()
                .orElseThrow()
                .getId();
        DATABASE.replaceAll(emp -> emp.getId().equals(employee.getId()) ? employee : null);
        return employee;
    }

    public Boolean deleteById(Integer id) {
        return DATABASE.removeIf(emp -> emp.getId().equals(id));
    }
}

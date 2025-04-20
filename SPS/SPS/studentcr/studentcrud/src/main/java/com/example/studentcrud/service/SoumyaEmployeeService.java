package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Employee;
import com.example.studentcrud.repository.SoumyaEmployeeRepository;

@Service
public class SoumyaEmployeeService {

    @Autowired
    private SoumyaEmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employee update(int id, Employee emp) {
        Employee existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(emp.getName());
            existing.setEmail(emp.getEmail());
            existing.setCity(emp.getCity());
            return repo.save(existing);
        }
        return null;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
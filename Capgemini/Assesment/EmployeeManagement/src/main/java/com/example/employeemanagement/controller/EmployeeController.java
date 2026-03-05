package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Create
    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return service.save(emp);
    }

    // Read All
    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    // Read By ID
    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id) {
        return service.getById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee emp) {
        return service.update(id, emp);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}
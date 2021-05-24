package com.employee.service;

import com.employee.entity.Employee;
import com.employee.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private ProductRepository repository;

    public Employee saveProduct(Employee emp) {
        return repository.save(emp);
    }

    public List<Employee> saveProducts(List<Employee> emp) {
        return repository.saveAll(emp);
    }

    public List<Employee> getProducts() {
        return repository.findAll();
    }

    public Employee getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }



}

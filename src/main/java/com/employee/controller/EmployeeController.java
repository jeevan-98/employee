package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addProduct(@RequestBody Employee emp) {
        return service.saveProduct(emp);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addProducts(@RequestBody List<Employee> emp) {
        return service.saveProducts(emp);
    }

    @GetMapping("/employees")
    public List<Employee> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/employeeById/{id}")
    public Employee findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/employee/{name}")
    public Employee findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}

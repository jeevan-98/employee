package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Employee;

public interface ProductRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
}


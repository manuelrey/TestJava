package com.testone.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testone.springbootrestapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

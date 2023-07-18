package com.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

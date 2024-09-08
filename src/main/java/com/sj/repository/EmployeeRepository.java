package com.sj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

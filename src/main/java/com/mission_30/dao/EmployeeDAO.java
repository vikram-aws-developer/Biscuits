package com.mission_30.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mission_30.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee , Integer>{

	List<Employee> findByDepartment(String department);

	List<Employee> findByDesignation(String designation);

	Optional<Employee> findByEmail(String email);

}

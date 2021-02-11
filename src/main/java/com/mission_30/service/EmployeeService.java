package com.mission_30.service;

import java.util.List;

import com.mission_30.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> listEmployee();

	List<Employee> listByDepart(String department);

	List<Employee> listByResig(String resignation);

	void terminateEmployee(String email);

}

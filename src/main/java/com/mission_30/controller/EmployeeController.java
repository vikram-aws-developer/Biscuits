package com.mission_30.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mission_30.model.Employee;
import com.mission_30.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value ="/homepage", method = RequestMethod.GET)
	public String home() {
		return "Welcome to Employee Common Service Portal";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST )
	public Employee cretaeEmployee(@RequestBody Employee employee)  {
		return empService.createEmployee(employee);
	}
	
	@RequestMapping(value ="/listEmployee", method = RequestMethod.GET)
	public List<Employee> listEmployee() {
		return empService.listEmployee();
	}
	
	@RequestMapping(value ="/listByDeprt/{department}", method = RequestMethod.GET) 
	public List<Employee> listByDeprt(@PathVariable String department) {
		return empService.listByDepart(department);
	}

	@RequestMapping(value ="/listByResig/{designation}", method = RequestMethod.GET) 
	public List<Employee> listByResig(@PathVariable String  designation) {
		return empService.listByResig( designation);
	}
	
	@RequestMapping(value ="/terminteEmp/{email}", method = RequestMethod.DELETE)
	public void terminateEmployee(@PathVariable String email) {
		empService.terminateEmployee(email);
	}
	
}

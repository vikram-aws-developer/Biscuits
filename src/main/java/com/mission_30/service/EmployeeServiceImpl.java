package com.mission_30.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission_30.dao.EmployeeDAO;
import com.mission_30.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO empDAO;

	@Override
	public Employee createEmployee(Employee employee) {
		
		// getting employee details by email id 
		Employee save=null;
		
		Optional<Employee> employee2 = empDAO.findByEmail(employee.getEmail());
		//employee2.get().getEmail().equalsIgnoreCase(employee.getEmail())		
		if(!employee2.isPresent()) {
			  save = empDAO.save(employee);
			  return save;
		} 
		else {
			System.out.println("Email ID already Exist");
		}

				return save;
		
		
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}

	@Override
	public List<Employee> listByDepart(String department) {
		// TODO Auto-generated method stub
		return empDAO.findByDepartment(department);
	}

	@Override
	public List<Employee> listByResig(String designation) {
		// TODO Auto-generated method stub
		return empDAO.findByDesignation(designation);
	}

	@Override
	public void terminateEmployee(String email) {
		 Optional<Employee> employee = empDAO.findByEmail(email);
		empDAO.deleteById(employee.get().getEmpId());
	}
	 

}
//
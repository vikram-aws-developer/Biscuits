package com.mission_30.service;

import java.util.List;

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
		return empDAO.save(employee);
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
	public List<Employee> listByResig(String resignation) {
		// TODO Auto-generated method stub
		return empDAO.findByResignation(resignation);
	}

	@Override
	public void terminateEmployee(String email) {
		Employee employee  = empDAO.findByEmail(email);
		empDAO.deleteById(employee.getEmpId());
	}
	 

}

package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	public void Save(Employee employee) {
		employeeRepository.save(employee);
	
	}
	
	public List<Employee> getEmployeeDetails(Integer employeeNo,String  employeeName) {
		return employeeRepository.findByEmployeeNoAndEmployeeName(employeeNo, employeeName);
	}
		
	}
	

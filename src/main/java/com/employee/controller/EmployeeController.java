package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("employees")
	@Validated
	public Integer employeeDetails(@RequestBody Employee employee) {
		employeeService.Save(employee);
		return employee.getEmployeeNo();
	}
	
	@RequestMapping("search/{employeeNo}/{employeeName}")
	public List<Employee> getEmployeeDetails(@PathVariable("employeeNo") Integer employeeNo,
			@PathVariable("employeeName") String employeeName) {
		return  employeeService.getEmployeeDetails(employeeNo, employeeName);
		
	}

}

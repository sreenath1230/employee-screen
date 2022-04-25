package com.employee.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	List<Employee> findByEmployeeNoAndEmployeeName(Integer employeeNo, String employeeName);

}

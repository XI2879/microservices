package com.employee.service;

import java.util.List;
import java.util.Optional;



import com.employee.entity.Employee;

public interface EmployeeInterface {
	
	
	public Employee save(Employee employee);
	public List<Employee> employeeList();
	public void deleteByEmp(Long id);
	public Optional<Employee> getById(Long id);


}

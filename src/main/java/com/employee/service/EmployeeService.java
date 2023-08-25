package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeService implements EmployeeInterface {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> employeeList() {
	
		return employeeRepository.findAll();
	}

	@Override
	public void deleteByEmp(Long id) {
		 employeeRepository.deleteById(id);
		
		
	}

	@Override
	public Optional<Employee> getById(Long id) {
		return employeeRepository.findById(id);
		
	}

}

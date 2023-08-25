package com.employee.entity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee)
	{
		employeeService.save(employee);
		return employee;
		
	}
	
	@GetMapping("list")
	public List<Employee> employeeList()
	{
		return employeeService.employeeList();
		
	}
	
	@GetMapping("{id}")
	public Optional<Employee> getById(@PathVariable("id") Long id)
	{
		return employeeService.getById( id);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteByEmp(@PathVariable("id") Long id)
	{
		employeeService.deleteByEmp(id);
		return "Employee Deleted Successfully!";
		
	}

}

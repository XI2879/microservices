package com.employee.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private Long empId;
	private String empName;
	private String gender;
	private String designation;
	private String location;
	private List<String> skillSet;

}

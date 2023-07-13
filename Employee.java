package com.employee;

import lombok.Data;

@Data
public class Employee {

	private String name;
	
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	

	
}

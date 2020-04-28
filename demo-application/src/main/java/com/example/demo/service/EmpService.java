package com.example.demo.service;

import java.util.List;

import com.example.demo.modal.Employee;

public interface EmpService {

	List<Employee> getEmployees();
	
	Employee saveEmployee(Employee employee);
}

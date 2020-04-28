package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmployeeRepository employeeRepo;
	
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

}

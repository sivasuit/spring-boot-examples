package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	EmpService empservice;
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees(){
		return empservice.getEmployees();
		
	}
	
	@RequestMapping(value="/employee",method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee){
		return empservice.saveEmployee(employee);
		
	}
}

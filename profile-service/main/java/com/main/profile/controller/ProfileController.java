package com.main.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.profile.service.Profileservice;
import com.rentcloud.domain.model.Customer;

@RestController
@RequestMapping(value="/services")
public class ProfileController {
	
	@Autowired
	Profileservice profileService;
	
	@RequestMapping(value="/profile")
	public Customer getProfile(@RequestBody Customer customer) {
		customer = profileService.save(customer);
		return customer;
	}

}
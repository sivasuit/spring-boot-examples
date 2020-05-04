package com.main.profile.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.profile.repository.ProfileRepository;
import com.rentcloud.domain.model.Customer;

public interface Profileservice {
	
	Customer save(Customer customer);

}

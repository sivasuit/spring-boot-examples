package com.main.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.profile.repository.ProfileRepository;
import com.rentcloud.domain.model.Customer;

@Service
public class ProfileserviceImpl implements Profileservice{

	@Autowired
	ProfileRepository profileRepo;
	
	@Override
	public Customer save(Customer customer) {
		return profileRepo.save(customer);
	}

}

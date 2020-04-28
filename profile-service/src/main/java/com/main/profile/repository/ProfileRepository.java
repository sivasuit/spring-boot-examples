package com.main.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentcloud.domain.model.Customer;

public interface ProfileRepository extends JpaRepository<Customer, Integer>{

	

}

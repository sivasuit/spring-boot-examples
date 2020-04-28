package com.main.consumer.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

	@Autowired
	Environment envrn;
	
	public String getDefaultModel() {
		System.out.println("--------getDefaultModel-----"+envrn.getProperty("vehicle.default.model"));
		return envrn.getProperty("vehicle.default.model");
	}
	
	public String getMinRentPeriod() {
		return envrn.getProperty("member.rent.min");
	}
	
}

package com.main.consumer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.consumer.modal.MemberProfileConfiguration;

@RestController
public class MemberProfileController {

	@Autowired
	MemberProfileConfiguration memberConfig;
	
	@RequestMapping(value="/member")
	public MemberProfileConfiguration getMemberConfig() {
		System.out.println("--------getMemberConfig-----");
		return memberConfig;
	}
}

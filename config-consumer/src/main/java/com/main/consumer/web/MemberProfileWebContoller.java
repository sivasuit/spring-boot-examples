package com.main.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.consumer.modal.MemberProfileConfiguration;

@Controller
public class MemberProfileWebContoller {
	
	@Autowired
	MemberProfileConfiguration memberConfig;
	
	@RequestMapping(value="/profile")
	public String getConfig(Model model) {
		model.addAttribute("default", memberConfig.getDefaultModel());
		model.addAttribute("min", memberConfig.getMinRentPeriod());
		return "mprofile";
	}

}

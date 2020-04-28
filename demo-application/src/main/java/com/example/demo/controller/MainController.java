package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/main")
public class MainController {

	@RequestMapping(value = "/rent")
	public String testRest() {
		return "Welcome to rent a car";
	}
}

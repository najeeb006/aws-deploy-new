package com.cognizant.awsdeploynew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("")
	public String welcome() {
		return "Welcome";
	}

}

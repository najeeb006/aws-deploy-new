package com.cognizant.awsdeploynew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("")
	public String welcome() {
		return "Welcome to the page V5";
	}
	@GetMapping("/help")
	public String help() {
		return "You are in help page V3";
	}

}

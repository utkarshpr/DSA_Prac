package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	
	@RequestMapping(path = "/home")
	public String firstHandler() {
		System.out.println("Home page ");
		return "home2";
	}
}

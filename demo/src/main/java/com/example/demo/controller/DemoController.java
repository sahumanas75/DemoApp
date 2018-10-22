package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/display")
public class DemoController {
	
	@GetMapping(value="/d1")
	public String display1() {
		return "Hey you, How are you";
	}

	@GetMapping(value="/d2")
	public String display2() {
		return "Hey, I am fine";
	}

}

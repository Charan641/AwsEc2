package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSE_controller {
	@GetMapping("/home")
	public String Dis() {
		return "Welcome to CSE Jenkins from Aditya University by Charan";
	}
	@GetMapping("/cse")
	public String Dis2() {
		return "Hi, this is Charan. Roll Number: 23MH1A05I2.";
	}
}
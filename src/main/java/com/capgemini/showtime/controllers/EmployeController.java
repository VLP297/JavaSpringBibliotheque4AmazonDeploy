package com.capgemini.showtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeController {

	// READ
	@GetMapping("/employe")
	public String showMenu() {
			
		return "employe";
	}
}

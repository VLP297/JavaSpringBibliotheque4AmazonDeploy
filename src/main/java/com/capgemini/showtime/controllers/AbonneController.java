package com.capgemini.showtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbonneController {

	// READ
	@GetMapping("/index")
	public String showMenu() {
		
		return "index";
	}

}

package com.capgemini.showtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbonneController {

	// READ
	@GetMapping("/abonne")
	public String showMenu() {
		
		return "abonne";
	}

}

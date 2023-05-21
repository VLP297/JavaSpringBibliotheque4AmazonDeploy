package com.capgemini.showtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivreController {

	// READ
	@GetMapping("/livre")
	public String showLivreMenu() {
		return "ListeLivre";
	}
}

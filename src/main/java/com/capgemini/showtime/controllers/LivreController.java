package com.capgemini.showtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.capgemini.showtime.repositories.LivreRepository;

@Controller
public class LivreController {
	
	@Autowired
	private LivreRepository livreRepository;

	// READ
	@GetMapping("/livre")
	public String showLivreMenu() {
		return "listeLivre";
	}
	
	// READ
	@GetMapping("/books")
	public String showAllBooks(Model model) {
		model.addAttribute("books", livreRepository.findAll());
		return "books";
	}
}

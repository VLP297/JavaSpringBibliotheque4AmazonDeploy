package com.capgemini.showtime.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.showtime.entities.Emprunt;
import com.capgemini.showtime.repositories.EmpruntRepository;

@RestController
@RequestMapping("api/loan")
public class EmpruntController {

	@Autowired
	private EmpruntRepository empruntRepository;

	// Retourne la liste de tous les emprunts pour l'abonné
	@GetMapping("/all")
	public List<Emprunt> displayAll() {
		List<Emprunt> le = empruntRepository.findAll();
		return le;
	}
}

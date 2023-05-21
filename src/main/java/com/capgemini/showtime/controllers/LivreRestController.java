package com.capgemini.showtime.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.showtime.entities.Emprunt;
import com.capgemini.showtime.entities.Livre;
import com.capgemini.showtime.repositories.LivreRepository;

@RestController
@RequestMapping("api/book")
public class LivreRestController {

	@Autowired
	private LivreRepository livreRepository;
	
	// READ
	@GetMapping("/livre")
	public String showLivreMenu() {
		
		return "ListeLivre";
	}

	// Retourne la liste de tous les emprunts pour l'abonné
	@GetMapping("/all")
	public List<Livre> displayAll() {
		List<Livre> ll = livreRepository.findAll();
		return ll;
	}
		
	// Chercher livre par auteur ou titre ou isbn
	@CrossOrigin()
	@GetMapping("/{auteur}/{titre}/{isbn}")
	public List<Livre> displayBookByCriteria(@PathVariable(name = "auteur") String nomAu,
			@PathVariable(name = "titre") String titre, @PathVariable(name = "isbn") int isbn) {
		List<Livre> ll = livreRepository.findByCriteria(nomAu, titre, isbn);
		return ll;
	}
	
	@CrossOrigin()
	@DeleteMapping("/{id}")
	public void supprimer(@PathVariable(name= "id") int id) {
		livreRepository.deleteById(id);
	}

}

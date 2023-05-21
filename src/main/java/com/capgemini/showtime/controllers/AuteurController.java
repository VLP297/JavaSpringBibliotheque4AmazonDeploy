package com.capgemini.showtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.showtime.entities.Auteur;
import com.capgemini.showtime.repositories.AuteurRepository;

@Controller
public class AuteurController {

	@Autowired
	private AuteurRepository auteurRepository;

	// CREATE
	@GetMapping("/auteur/create")
	public String showCreateAuthorPage(Model model) {
		model.addAttribute("auteur", new Auteur());
		
		return "creation";
	}

	@PostMapping("/auteur/ajout")
	public String createAuthor(Auteur auteur, Model model) {
		
	    auteurRepository.save(auteur);

		return "redirect:/auteur";
	}

	// READ
	@GetMapping("/auteur")
	public String showAllAuthors(Model model) {
		model.addAttribute("auteurs", auteurRepository.findAll());
		return "auteur";
	}

	// UPDATE
	@GetMapping("/auteur/edit/{numAuteur}")
	public String showEditAuthorPage(@PathVariable("numAuteur") int numAuteur, Model model) {

		Auteur auteur = auteurRepository.findById(numAuteur)
				.orElseThrow(() -> new IllegalArgumentException("Auteur inexistant avec cet ID !"));

		model.addAttribute("auteur", auteur);

		return "edition";
	}

	@PostMapping("/auteur/update/{numAuteur}")
	public String updateAuthor(@PathVariable("numAuteur") int numAuteur, Auteur auteur, Model model) {
		auteur.setNumAuteur(numAuteur);

		auteurRepository.save(auteur);

		return "redirect:/auteur";
	}

	// DELETE
	@GetMapping("/auteur/delete/{numAuteur}")
	public String deleteAuthor(@PathVariable("numAuteur") int numAuteur, Model model) {

		try {

			auteurRepository.deleteById(numAuteur);

		} catch (Exception e) {
			model.addAttribute("message", "Livre(s) emprunté(s) ! L'auteur ne peut pas être supprimé !");
			return "/erreur";
		}
		return "redirect:/auteur";
	}

}
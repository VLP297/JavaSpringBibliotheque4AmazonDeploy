package com.capgemini.showtime.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.capgemini.showtime.entities.Emprunt;
import com.capgemini.showtime.entities.User;
import com.capgemini.showtime.repositories.EmpruntRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpruntController {
    
	@Autowired
	private EmpruntRepository empruntRepository;
    
    // READ FOR ABONNE
 	@GetMapping("/mesemprunts")
 	public String showMesEmprunts(Model model, HttpSession session) {
 		Long id = (Long) session.getAttribute("userId");
 		model.addAttribute("emprunts", empruntRepository.findEmpruntById(id));
 		return "emprunts";
 	}

 	// READ FOR EMPLOYEE
    @GetMapping("/emprunts")
    public List<Emprunt> getAllEmprunts() {
        return empruntRepository.findAll();
    }
}
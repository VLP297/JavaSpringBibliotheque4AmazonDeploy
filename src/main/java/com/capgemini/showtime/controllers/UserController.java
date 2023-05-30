package com.capgemini.showtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.showtime.entities.User;
import com.capgemini.showtime.repositories.EmpruntRepository;
import com.capgemini.showtime.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(User user) {
        String login = user.getLogin();
        String password = user.getPassword();

        // Vérification d'authentification
        User authenticatedUser = userRepository.findByLoginAndPassword(login, password);

        if (authenticatedUser != null) {
        	// Authentification réussie
            if (authenticatedUser.getUserType() == "Abonne") {
            return "redirect:/abonne";
            } else {
            	return "redirect:/employe";
            }
        } else {
            // Authentification échouée
            return "login";
        }
    }

    // Autres méthodes et fonctionnalités du contrôleur
}

package com.capgemini.showtime.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.showtime.entities.User;
import com.capgemini.showtime.repositories.UserRepository;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void redirectToLanding(HttpServletResponse httpServletResponse) throws IOException {
	    httpServletResponse.sendRedirect("login");
	}

	@GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(User user, HttpSession session) {
        String login = user.getLogin();
        String password = user.getPassword();

        // Vérification d'authentification
        User authenticatedUser = userRepository.findByLoginAndPassword(login, password);

        if (authenticatedUser != null) {
        	        	 
        	// Authentification réussie
            if (authenticatedUser.getUserType().equalsIgnoreCase("Abonne")){
            	session.setAttribute("userId", authenticatedUser.getId());            	
            	
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

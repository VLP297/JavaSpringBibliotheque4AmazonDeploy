package com.capgemini.showtime.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "login")
	private int login;
	
	
	private int passwd;
	
	
}

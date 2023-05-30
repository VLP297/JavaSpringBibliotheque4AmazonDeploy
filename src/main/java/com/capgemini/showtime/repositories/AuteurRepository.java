package com.capgemini.showtime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.showtime.entities.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Integer>{

	// Rechercher tous les auteurs
	List<Auteur> findAll();
	
	// numéro
	List<Auteur> findByNumAuteur(int numAuteur);
	
	// nom
	List<Auteur> findByNomAuLike(String nomAu);
	
	// prénom
	List<Auteur> findByPrenomAuLike(String prenomAu);
	
	// nationalité 
	List<Auteur> findByNationaliteAu(String nationalite);
	
}

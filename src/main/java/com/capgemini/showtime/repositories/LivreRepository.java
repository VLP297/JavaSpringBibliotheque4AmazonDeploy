package com.capgemini.showtime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.showtime.entities.Auteur;
import com.capgemini.showtime.entities.Livre;


public interface LivreRepository extends JpaRepository<Livre, Integer>{

	// Chercher un ou plusieurs livres par auteur, ISBN ou par critères multiples
	List<Livre> findByAuteur(Auteur auteur);
	List<Livre> findByTitreLike(String titre);
	List<Livre> findByIsbnLivre(int isbnLivre);
	
	@Query(value = "SELECT l.* FROM livre l JOIN auteur a ON l.num_auteur = a.num_auteur"
				 + " WHERE a.nom_auteur = :nomAu OR l.titre LIKE %:titre% OR l.isbn_livre = :isbn", nativeQuery = true)
	List<Livre> findByCriteria(@Param("nomAu")String nomAu, @Param("titre")String titre, @Param("isbn")int isbn);
}

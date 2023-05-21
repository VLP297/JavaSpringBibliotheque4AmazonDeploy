package com.capgemini.showtime.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "isbn_livre")
	private int isbnLivre;
	
	private String titre;
	
	private String editeur;
	
	@Column(name="nbre_pages")
	private int nbrePages;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "num_auteur")
	@JsonIgnore
	private Auteur auteur;

	@OneToMany(mappedBy = "livre")
	@JsonIgnore
	private List<Emprunt> emprunts;

	public int getIsbnLivre() {
		return isbnLivre;
	}

	public void setIsbnLivre(int isbnLivre) {
		this.isbnLivre = isbnLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getNbrePages() {
		return nbrePages;
	}

	public void setNbrePages(int nbrePages) {
		this.nbrePages = nbrePages;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

	public Livre(int isbnLivre, String titre, String editeur, int nbrePages, Auteur auteur, List<Emprunt> emprunts) {
		super();
		this.isbnLivre = isbnLivre;
		this.titre = titre;
		this.editeur = editeur;
		this.nbrePages = nbrePages;
		this.auteur = auteur;
		this.emprunts = emprunts;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
}

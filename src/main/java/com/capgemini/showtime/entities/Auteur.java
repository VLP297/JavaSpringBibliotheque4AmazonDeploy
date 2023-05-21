package com.capgemini.showtime.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Auteur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auteur_generator")
	@SequenceGenerator(name = "auteur_generator", sequenceName = "auteur_seq", allocationSize = 1)
	@Column(name = "num_auteur")
	int numAuteur;
	
	@Column(name = "nom_auteur")
	String nomAu;
	
	@Column(name = "prenom_auteur")
	String prenomAu;
	
	@Column(name = "nationalite_auteur", length = 20)
	String nationaliteAu;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "auteur")
	@JsonIgnore
	private List<Livre> livres;

	public int getNumAuteur() {
		return numAuteur;
	}

	public void setNumAuteur(int numAuteur) {
		this.numAuteur = numAuteur;
	}

	public String getNomAu() {
		return nomAu;
	}

	public void setNomAu(String nomAu) {
		this.nomAu = nomAu;
	}

	public String getPrenomAu() {
		return prenomAu;
	}

	public void setPrenomAu(String prenomAu) {
		this.prenomAu = prenomAu;
	}

	public String getNationaliteAu() {
		return nationaliteAu;
	}

	public void setNationaliteAu(String nationaliteAu) {
		this.nationaliteAu = nationaliteAu;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public Auteur(int numAuteur, String nomAu, String prenomAu, String nationaliteAu, List<Livre> livres) {
		super();
		this.numAuteur = numAuteur;
		this.nomAu = nomAu;
		this.prenomAu = prenomAu;
		this.nationaliteAu = nationaliteAu;
		this.livres = livres;
	}

	public Auteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

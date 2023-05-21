package com.capgemini.showtime.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Abonne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abonne_generator")
	@SequenceGenerator(name = "abonne_generator", sequenceName = "abonne_seq", allocationSize = 1)
	@Column(name="num_abonne")
	int numAbonne;
	
	@Column(name="last_name")
	private String nomAbonne;
	
	@Column(name="first_name")
	private String prenomAb;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="telephone")
	private Long telephoneAb;
	
	@OneToMany(mappedBy = "abonne")
	@JsonIgnore
	private List<Emprunt> emprunts;

	public int getNumAbonne() {
		return numAbonne;
	}

	public void setNumAbonne(int numAbonne) {
		this.numAbonne = numAbonne;
	}

	public String getNomAbonne() {
		return nomAbonne;
	}

	public void setNomAbonne(String nomAbonne) {
		this.nomAbonne = nomAbonne;
	}

	public String getPrenomAb() {
		return prenomAb;
	}

	public void setPrenomAb(String prenomAb) {
		this.prenomAb = prenomAb;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getTelephoneAb() {
		return telephoneAb;
	}

	public void setTelephoneAb(Long telephoneAb) {
		this.telephoneAb = telephoneAb;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

	public Abonne(int numAbonne, String nomAbonne, String prenomAb, String adresse, Long telephoneAb,
			List<Emprunt> emprunts) {
		super();
		this.numAbonne = numAbonne;
		this.nomAbonne = nomAbonne;
		this.prenomAb = prenomAb;
		this.adresse = adresse;
		this.telephoneAb = telephoneAb;
		this.emprunts = emprunts;
	}

	public Abonne() {
		super();
		// TODO Auto-generated constructor stub
	}

}

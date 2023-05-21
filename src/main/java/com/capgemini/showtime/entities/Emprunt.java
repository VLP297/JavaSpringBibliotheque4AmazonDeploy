package com.capgemini.showtime.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@IdClass(EmpruntId.class)
public class Emprunt {

	@Id
	@Temporal(TemporalType.DATE)
	private Date dateEmprunt;

	@Temporal(TemporalType.DATE)
	private Date dateRetourPrevue;

	@Temporal(TemporalType.DATE)
	private Date dateRetourEffective;

	@Transient
	Boolean retard;

	public Boolean isEnRetard() {

		String violation = "Pas de violation";
		Date today = new Date(); 
		
		// Recherche violation de type "à retourner" 
		if (dateRetourEffective == null && (today.after(dateRetourPrevue))){ 
			violation = "Doit être retourné"; 
		}
		
		// Recherche violation de type "retourné avec retard" 
		if (dateRetourEffective != null) { 
			violation = (dateRetourEffective.after(dateRetourPrevue)) ? "Rendu avec retard" : "Pas de violation"; 
		} 
		
		retard = (violation == "Doit être retourné" || violation == "Rendu avec retard") ? true : false;
		
		return retard; 
	}

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "num_abonne")
	private Abonne abonne;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "isbn_livre")
	private Livre livre;

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetourPrevue() {
		return dateRetourPrevue;
	}

	public void setDateRetourPrevue(Date dateRetourPrevue) {
		this.dateRetourPrevue = dateRetourPrevue;
	}

	public Date getDateRetourEffective() {
		return dateRetourEffective;
	}

	public void setDateRetourEffective(Date dateRetourEffective) {
		this.dateRetourEffective = dateRetourEffective;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Emprunt(Date dateEmprunt, Date dateRetourPrevue, Date dateRetourEffective, Abonne abonne, Livre livre) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRetourPrevue = dateRetourPrevue;
		this.dateRetourEffective = dateRetourEffective;
		this.abonne = abonne;
		this.livre = livre;
	}

	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}

}

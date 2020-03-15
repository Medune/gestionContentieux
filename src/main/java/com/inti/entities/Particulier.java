package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("particulier")
public class Particulier extends Tiers{

	
	private static final long serialVersionUID = 1L;

	private String CIN;
	private String nom;
	private String prenom;
	
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String CIN) {
		this.CIN = CIN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Particulier() {
		super();
	}
	public Particulier(String adresse, double tel) {
		super(adresse, tel);
	}
	
	
}

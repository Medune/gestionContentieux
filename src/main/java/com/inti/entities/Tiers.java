package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tiers  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTiers;
	private String adresse;
	private double tel;
	public Long getIdTiers() {
		return idTiers;
	}
	public void setIdTiers(Long idTiers) {
		this.idTiers = idTiers;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getTel() {
		return tel;
	}
	public void setTel(double tel) {
		this.tel = tel;
	}
	public Tiers() {
		super();
	}
	public Tiers(Long idTiers, String adresse, double tel) {
		super();
		this.idTiers = idTiers;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	
}

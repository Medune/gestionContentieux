package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Tiers  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTiers;
	private String adresse;
	private double tel;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	
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
	public Tiers(String adresse, double tel) {
		super();
		this.adresse = adresse;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Tiers [adresse=" + adresse + ", tel=" + tel + ", utilisateur=" + utilisateur + ", domaine ="
				+ super.toString() + "]";
	}
	
	
	
	
}

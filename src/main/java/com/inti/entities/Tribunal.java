package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tribunal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTribunal;
	private String nomTribunal;
	private String adresse;
	private double fax;
	private double tel;
	private String region;
	@OneToMany(mappedBy="tribunal", fetch=FetchType.EAGER)
	private Set<Affaire> affaires = new HashSet<>();
	
	
	public Long getIdTribunal() {
		return idTribunal;
	}
	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getFax() {
		return fax;
	}
	public void setFax(double fax) {
		this.fax = fax;
	}
	public double getTel() {
		return tel;
	}
	public void setTel(double tel) {
		this.tel = tel;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}	
	public Set<Affaire> getAffaires() {
		return affaires;
	}
	public void setAffaires(Set<Affaire> affaires) {
		this.affaires = affaires;
	}

	public String getNomTribunal() {
		return nomTribunal;
	}
	public void setNomTribunal(String nomTribunal) {
		this.nomTribunal = nomTribunal;
	}
	
	public Tribunal() {
		super();
	}
	public Tribunal(String nomTribunal, String adresse, double fax, double tel, String region) {
		super();
		this.nomTribunal = nomTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}
	
	
}

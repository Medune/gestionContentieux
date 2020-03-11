package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tribunal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private double fax;
	private double tel;
	private String region;
	
	
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
	
	public Tribunal() {
		super();
	}
	public Tribunal(Long idTribunal, String adresse, double fax, double tel, String region) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}
	
	
}

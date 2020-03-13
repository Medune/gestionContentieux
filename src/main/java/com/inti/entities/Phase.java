package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPhase;
	private String nomPhase;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Affaire affaire;
	
	public Long getIdPhase() {
		return idPhase;
	}
	public void setIdPhase(Long idPhase) {
		this.idPhase = idPhase;
	}
	public String getNomPhase() {
		return nomPhase;
	}
	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}
	
	public Affaire getAffaire() {
		return affaire;
	}
	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}
	public Phase(String nomPhase, Affaire affaire) {
		super();
		this.nomPhase = nomPhase;
		this.affaire = affaire;
	}
	public Phase() {
		super();
	}
	
	
}

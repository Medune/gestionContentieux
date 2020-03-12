package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Phase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPhase;
	private String nomPhase;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date datefin) {
		this.dateFin = datefin;
	}
	
	public Affaire getAffaire() {
		return affaire;
	}
	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}
	public Phase(String nomPhase, Date dateDebut, Date dateFin, Affaire affaire) {
		super();
		this.nomPhase = nomPhase;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.affaire = affaire;
	}
	public Phase() {
		super();
	}
	
	
}

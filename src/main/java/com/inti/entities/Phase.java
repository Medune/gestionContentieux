package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Phase(Long idPhase, String nomPhase, Date dateDebut, Date dateFin) {
		super();
		this.idPhase = idPhase;
		this.nomPhase = nomPhase;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Phase() {
		super();
	}
	
	
}

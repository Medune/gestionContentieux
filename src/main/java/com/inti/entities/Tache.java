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
public class Tache  implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTache;
	
	@Temporal(TemporalType.DATE)	
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	
	public Long getIdTache() {
		return idTache;
	}
	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatutAudience() {
		return statutAudience;
	}
	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}
	public Tache(Long idTache, Date dateCreation, String titre, String description, boolean statutAudience) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;
	}
	public Tache() {
		super();
	}
	
	
}
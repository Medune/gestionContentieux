package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Affaire  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int statut;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="affaire", fetch=FetchType.EAGER)
	private Set<Phase> phases = new HashSet<>();
	@ManyToOne(fetch=FetchType.EAGER)
	private Tribunal tribunal;
	@OneToMany(mappedBy="affaire", fetch=FetchType.EAGER)
	private Set<Tache> taches = new HashSet<>();
	
	
	
	public Long getIdAffaire() {
		return idAffaire;
	}
	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
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
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Set<Phase> getPhases() {
		return phases;
	}
	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}
	public Tribunal getTribunal() {
		return tribunal;
	}
	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}
	public Set<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public Affaire() {
		super();
	}
	public Affaire(String titre, String description, int statut, Utilisateur utilisateur, Tribunal tribunal) {
		super();
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.utilisateur = utilisateur;
		this.tribunal = tribunal;
	}

	
	
}

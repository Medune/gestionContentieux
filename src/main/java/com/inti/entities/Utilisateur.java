package com.inti.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	@Column(unique=true)
	private String username;
	private String password;
	private boolean enabled = true;
	@ManyToOne
	private Role role;
	@OneToMany(mappedBy = "utilisateur", fetch = FetchType.EAGER)
	private Set<Affaire> affaires = new HashSet<>();
	@OneToMany(mappedBy = "utilisateur", fetch = FetchType.EAGER)
	private Set<Tiers> tiers = new HashSet<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Utilisateur(String email, String nomUtilisateur, String prenomUtilisateur, String username, String password,
			boolean enabled) {
		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	

	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
	}

	public Set<Affaire> getAffaires() {
		return affaires;
	}

	public void setAffaires(Set<Affaire> affaires) {
		this.affaires = affaires;
	}

	public Utilisateur() {
		super();
	}



	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}

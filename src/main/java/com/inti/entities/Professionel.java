package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("professionel")
public class Professionel extends Tiers {


	private static final long serialVersionUID = 1L;

	private String raisonSocial;

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public Professionel() {
		super();
	}

	public Professionel(String adresse, double tel) {
		super(adresse, tel);
	}

}

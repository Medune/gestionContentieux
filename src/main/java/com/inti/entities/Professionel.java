package com.inti.entities;

public class Professionel  extends Tiers{

	/**
	 * 
	 */
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
		// TODO Auto-generated constructor stub
	}

	public Professionel(String adresse, double tel) {
		super(adresse, tel);
		// TODO Auto-generated constructor stub
	}
	
	
}

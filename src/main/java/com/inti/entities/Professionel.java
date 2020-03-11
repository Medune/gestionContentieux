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

	public Professionel(Long idTiers, String adresse, double tel) {
		super(idTiers, adresse, tel);
		// TODO Auto-generated constructor stub
	}
	
	
}

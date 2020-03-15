package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Tiers;

public interface ITierService {
	
	List<Tiers> findAll();
	Tiers findOne(Long id);
	Tiers save(Tiers tier);
	void delete(Long id);
	

}

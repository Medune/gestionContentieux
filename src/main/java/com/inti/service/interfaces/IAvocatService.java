package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Avocat;

public interface IAvocatService {
	
	List<Avocat> findAll();
	Avocat findOne(Long id);
	Avocat save(Avocat user);
	
}

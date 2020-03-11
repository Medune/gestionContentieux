package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Avocat;
import com.inti.repository.AvocatRepository;
import com.inti.service.interfaces.IAvocatService;

public class AvocatService implements IAvocatService{
	
	@Autowired
	AvocatRepository avocatRepository;
	
	@Override
	public List<Avocat> findAll() {
		return avocatRepository.findAll();
	}

	@Override
	public Avocat findOne(Long id) {
		return avocatRepository.findOne(id);
	}

	@Override
	public Avocat save(Avocat user) {
		return avocatRepository.save(user);
	}




}

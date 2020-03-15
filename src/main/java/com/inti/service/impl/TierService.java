package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inti.entities.Tiers;
import com.inti.repository.TierRepository;
import com.inti.service.interfaces.ITierService;

@Service
public class TierService implements ITierService {
	
	@Autowired
	TierRepository tierRepository;
	
	@Override
	public List<Tiers> findAll() {
		return tierRepository.findAll();
	}

	@Override
	public Tiers findOne(Long id) {
		return tierRepository.findOne(id);
	}

	@Override
	public Tiers save(Tiers tier) {
		return tierRepository.save(tier);
	}

	@Override
	public void delete(Long id) {
		tierRepository.delete(id);
		
	}

}

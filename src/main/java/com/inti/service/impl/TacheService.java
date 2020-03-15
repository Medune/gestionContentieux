package com.inti.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Tache;
import com.inti.repository.TacheRepository;
import com.inti.service.interfaces.ITacheService;

@Service
public class TacheService implements ITacheService{

	@Autowired
	TacheRepository tacheRepository;
	
	@Override
	public List<Tache> findAll() {
		return tacheRepository.findAll();
	}

	@Override
	public Tache findOne(Long id) {
		
		return tacheRepository.findOne(id);
	}

	@Override
	public Tache save(Tache tache) {
	
		return tacheRepository.save(tache);
	}

	@Override
	public void delete(Long id) {
		tacheRepository.delete(id);		
	}
	@Override
	public Tache findOneByTitre(String titre) {
		return tacheRepository.findOneByTitre(titre);
	}
	@Override
	public Tache findOneByDateDebut(Date dateDebut) {
		return tacheRepository.findOneByDateDebut(dateDebut);
	}
	@Override
	public List<Tache> findAllByDateDebut(Date dateDebut) {
		return tacheRepository.findAllByDateDebut(dateDebut);
	}


}

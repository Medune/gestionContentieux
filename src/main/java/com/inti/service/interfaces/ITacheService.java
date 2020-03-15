package com.inti.service.interfaces;

import java.util.Date;
import java.util.List;

import com.inti.entities.Tache;

public interface ITacheService {
	
	List<Tache> findAll();
	Tache findOne(Long id);
	Tache save(Tache tache);
	void delete(Long id);
	Tache findOneByTitre(String titre);
	Tache findOneByDateDebut(Date dateDebut);
	List<Tache> findAllByDateDebut(Date dateDebut);
}

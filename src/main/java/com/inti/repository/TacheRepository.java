package com.inti.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Long>{
	Tache findOneByTitre(String titre);
	Tache findOneByDateDebut(Date dateDebut);
	List<Tache> findAllByDateDebut(Date dateDebut);
	}

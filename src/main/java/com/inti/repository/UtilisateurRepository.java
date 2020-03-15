 package com.inti.repository;
 
 import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

import com.inti.entities.Utilisateur;

 @Repository
 public interface UtilisateurRepository extends JpaRepository<Utilisateur, Serializable> {  // Long fait référence au type de l'id
 
	 Utilisateur findOneByUsername(String username);
}

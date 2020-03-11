 package com.inti.repository;
 
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;
 
 import com.inti.entities.Utilisateur;
 
 @Repository
 public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {  // Long fait référence au type de l'id
 
}

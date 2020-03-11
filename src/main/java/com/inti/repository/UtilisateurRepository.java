<<<<<<< HEAD
 package com.inti.repository;
 
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;
 
 import com.inti.entities.Utilisateur;
 
 @Repository
 public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {  // Long fait référence au type de l'id
 
}
=======
package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> { // Long fait référence au type de l'id

}
 
>>>>>>> 05582882387d7ebcb1b1f37f9223fff38a7f2775

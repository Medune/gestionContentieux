package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;

@CrossOrigin
@RestController
public class AffaireController {
	@Autowired
	IAffaireService affaireService;
	
	@GetMapping(value="affaires")
	public List<Affaire> findAll(){
		return affaireService.findAll();
	}
	@GetMapping(value="affaires/{idAffaire}")
	public Affaire findOne(@PathVariable ("idAffaire")Long id) {
		return affaireService.findOne(id);
	}
	@PostMapping(value="affaires")
	public Affaire saveAffaire(@RequestBody Affaire affaire) {
		return affaireService.save(affaire);
	}
	@DeleteMapping(value="affaires/{idAffaire}")
	public void deleteAffaire(@PathVariable ("idAffaire")Long id) {
		affaireService.delete(id);
	}
	@PutMapping(value="affaires/{idAffaire}")
	public Affaire updateAffaire(@PathVariable ("idAffaire")Long id, @RequestBody Affaire affaire) {
		Affaire currentAffaire = affaireService.findOne(id);
		currentAffaire.setReference(affaire.getReference());
		currentAffaire.setTitre(affaire.getTitre());
		currentAffaire.setDescription(affaire.getDescription());
		currentAffaire.setStatut(affaire.getStatut());
		return affaireService.save(currentAffaire);
	}
}

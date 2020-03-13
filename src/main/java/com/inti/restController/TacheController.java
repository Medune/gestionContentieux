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

import com.inti.entities.Tache;
import com.inti.service.interfaces.ITacheService;

@CrossOrigin
@RestController
public class TacheController {
	@Autowired
	ITacheService tacheService;
	
	@GetMapping(value="taches")
	public List<Tache> findAll(){
		return tacheService.findAll();
	}
	@GetMapping(value="taches/{idTache}")
	public Tache findOne(@PathVariable ("idTache")Long id) {
		return tacheService.findOne(id);
	}
	@PostMapping(value="taches")
	public Tache saveTache(@RequestBody Tache tache) {
		return tacheService.save(tache);
	}
	@DeleteMapping(value="taches/{idTache}")
	public void deleteTache(@PathVariable ("idTache")Long id) {
		tacheService.delete(id);
	}
	@PutMapping(value="taches/{idTache}")
	public Tache updateTache(@PathVariable ("idTache")Long id, @RequestBody Tache tache) {
		Tache currentTache = tacheService.findOne(id);
		currentTache.setDateCreation(tache.getDateCreation());
		currentTache.setDateDebut(tache.getDateDebut());
		currentTache.setDateFin(tache.getDateFin());
		currentTache.setTitre(tache.getTitre());
		currentTache.setDescription(tache.getDescription());
		currentTache.setStatutAudience(tache.isStatutAudience());
		return tacheService.save(currentTache);
	}
}

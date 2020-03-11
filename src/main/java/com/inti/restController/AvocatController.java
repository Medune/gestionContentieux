package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Avocat;
import com.inti.service.interfaces.IAvocatService;

@CrossOrigin
@RestController
public class AvocatController {
	
	@Autowired
	IAvocatService avocatService;

	@RequestMapping(value = "avocats", method = RequestMethod.GET)
	public List<Avocat> findAll() {
		return avocatService.findAll();
	}

	@RequestMapping(value = "avocats/{idUtilisateur}", method = RequestMethod.GET)
	public Avocat findOne(@PathVariable("idUtilisateur") Long id) {
		return avocatService.findOne(id);
	}

	@RequestMapping(value = "avocats", method = RequestMethod.POST)
	public Avocat saveAvocat(@RequestBody Avocat avocat) {
		return avocatService.save(avocat);
	}

	@RequestMapping(value = "avocats/{idUtilisateur}", method = RequestMethod.PUT) // PUT pour faire des mises à jour
	public Avocat updateAvocat(@PathVariable("idUtilisateur") Long id, @RequestBody Avocat avocat) {
		Avocat currentAvocat = avocatService.findOne(id);
		currentAvocat.setNomUtilisateur(avocat.getNomUtilisateur());
		currentAvocat.setPrenomUtilisateur(avocat.getPrenomUtilisateur());
		currentAvocat.setUsername(avocat.getUsername());
		currentAvocat.setPassword(avocat.getPassword());

		return avocatService.save(currentAvocat);

	}

}

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;

	@RequestMapping(value="utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping(value="utilisateurs/{idUser}")
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}
	@RequestMapping(value="utilisateurs", method = RequestMethod.POST)
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur user) {
		return utilisateurService.save(user);
	}

	@DeleteMapping(value="utilisateurs/{idUser}")
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long id) {
		utilisateurService.delete(id);
	}

	@PutMapping(value="roles/{idUtilisateur}") // PUT pour faire des mises à jour
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long id, @RequestBody Utilisateur user) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(id);
		currentUtilisateur.setNomUtilisateur(user.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(user.getPrenomUtilisateur());
		currentUtilisateur.setUsername(user.getUsername());
		currentUtilisateur.setPassword(user.getPassword());

		return utilisateurService.save(currentUtilisateur);

	}

}

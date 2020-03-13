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

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;

	@GetMapping(value="utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping(value="utilisateurs/{idUtilisateur}")
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}
	@PostMapping(value="utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}

	@DeleteMapping(value="utilisateurs/{idUtilisateur}")
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long id) {
		utilisateurService.delete(id);
	}

	@PutMapping(value="roles/{idUtilisateur}") // PUT pour faire des mises à jour
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long id, @RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(id);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		currentUtilisateur.setUsername(utilisateur.getUsername());
		currentUtilisateur.setPassword(utilisateur.getPassword());

		return utilisateurService.save(currentUtilisateur);

	}

}

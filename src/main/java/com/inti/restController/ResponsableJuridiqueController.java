package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.ResponsableJuridique;

@CrossOrigin
@RestController
public class ResponsableJuridiqueController {
	
	@Autowired
	IResponsableJuridiqueService responsableJuridiqueService;

	@RequestMapping(value = "responsableJuridiques", method = RequestMethod.GET)
	public List<ResponsableJuridique> findAll() {
		return responsableJuridiqueService.findAll();
	}

	@RequestMapping(value = "responsableJuridiques/{idResponsableJuridique}", method = RequestMethod.GET)
	public ResponsableJuridique findOne(@PathVariable("idResponsableJuridique") Long id) {
		return responsableJuridiqueService.findOne(id);
	}

	@RequestMapping(value = "responsableJuridiques", method = RequestMethod.POST)
	public ResponsableJuridique saveResponsableJuridique(@RequestBody ResponsableJuridique responsableJuridique) {
		return responsableJuridiqueService.save(responsableJuridique);
	}

	@RequestMapping(value = "responsableJuridiques/{idResponsableJuridique}", method = RequestMethod.PUT) // PUT pour faire des mises à jour
	public ResponsableJuridique updateResponsableJuridique(@PathVariable("idResponsableJuridique") Long id, @RequestBody ResponsableJuridique responsableJuridique) {
		ResponsableJuridique currentResponsableJuridique = responsableJuridiqueService.findOne(id);
		currentResponsableJuridique.setNomUtilisateur(responsableJuridique.getNomUtilisateur());
		currentResponsableJuridique.setPrenomUtilisateur(responsableJuridique.getPrenomUtilisateur());
		currentResponsableJuridique.setUsername(responsableJuridique.getUsername());
		currentResponsableJuridique.setPassword(responsableJuridique.getPassword());

		return responsableJuridiqueService.save(currentResponsableJuridique);

	}


}

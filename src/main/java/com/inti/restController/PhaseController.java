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

import com.inti.entities.Phase;
import com.inti.service.interfaces.IPhaseService;

@CrossOrigin
@RestController
public class PhaseController {
	@Autowired
	IPhaseService phaseService;
	
	@GetMapping(value="phases")
	public List<Phase> findAll(){
		return phaseService.findAll();
	}
	@GetMapping(value="phases/{idPhase}")
	public Phase findOne(@PathVariable ("idPhase")Long id) {
		return phaseService.findOne(id);
	}
	@PostMapping(value="phases")
	public Phase savePhase(@RequestBody Phase phase) {
		return phaseService.save(phase);
	}
	@DeleteMapping(value="phases/{idPhase}")
	public void deletePhase(@PathVariable ("idPhase")Long id) {
		phaseService.delete(id);
	}
	@PutMapping(value="phases/{idPhase}")
	public Phase updatePhase(@PathVariable ("idPhase")Long id, @RequestBody Phase phase) {
		Phase currentPhase = phaseService.findOne(id);
		currentPhase.setNomPhase(phase.getNomPhase());
		currentPhase.setDateDebut(phase.getDateDebut());
		currentPhase.setDateFin(phase.getDateFin());
		return phaseService.save(currentPhase);
	}
}

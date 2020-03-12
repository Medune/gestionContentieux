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

import com.inti.entities.Tribunal;
import com.inti.service.interfaces.ITribunalService;

@CrossOrigin
@RestController
public class TribunalController {
	@Autowired
	ITribunalService tribunalService;
	
	@GetMapping(value="tribunals")
	public List<Tribunal> findAll(){
		return tribunalService.findAll();
	}
	@GetMapping(value="tribunals/{idTribunal}")
	public Tribunal findOne(@PathVariable ("idTribunal")Long id) {
		return tribunalService.findOne(id);
	}
	@PostMapping(value="tribunals")
	public Tribunal saveTribunal(@RequestBody Tribunal tribunal) {
		return tribunalService.save(tribunal);
	}
	@DeleteMapping(value="tribunals/{idTribunal}")
	public void deleteTribunal(@PathVariable ("idTribunal")Long id) {
		tribunalService.delete(id);
	}
	@PutMapping(value="tribunals/{idTribunal}")
	public Tribunal updateTribunal(@PathVariable ("idTribunal")Long id, @RequestBody Tribunal tribunal) {
		Tribunal currentTribunal = tribunalService.findOne(id);
		currentTribunal.setAdresse(tribunal.getAdresse());
		currentTribunal.setFax(tribunal.getFax());
		currentTribunal.setTel(tribunal.getTel());
		currentTribunal.setRegion(tribunal.getRegion());
		return tribunalService.save(currentTribunal);
	}
}

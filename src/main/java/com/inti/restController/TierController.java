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

import com.inti.entities.Tiers;
import com.inti.service.interfaces.ITierService;

@RestController
@CrossOrigin
public class TierController {
	
	@Autowired
	ITierService tierService;
	
	@GetMapping(value="tiers")
	public List<Tiers> findAll(){
		return tierService.findAll();
	}
	@GetMapping(value="tiers/{idTier}")
	public Tiers findOne(@PathVariable ("idTier")Long id) {
		return tierService.findOne(id);
	}
	@PostMapping(value="tiers")
	public Tiers saveTier(@RequestBody Tiers tier) {
		return tierService.save(tier);
	}
	@DeleteMapping(value="tiers/{idTier}")
	public void deleteTier(@PathVariable ("idTier")Long id) {
		tierService.delete(id);
	}
	@PutMapping(value="tiers/{idTier}")
	public Tiers updateTier(@PathVariable ("idTier")Long id, @RequestBody Tiers tier) {
		Tiers currentTier = tierService.findOne(id);
		currentTier.setAdresse(tier.getAdresse());
		currentTier.setTel(tier.getTel());
		return tierService.save(currentTier);
	}

}

package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.ResponsableJuridique;
import com.inti.service.interfaces.IResponsableJuridique;

public class ResponsableJuridiqueService implements IResponsableJuridique {
	
	@Autowired
	ResponsableJuridiqueRepository responsableJuridiqueRepository;
	
	@Override
	public List<ResponsableJuridique> findAll() {
		return responsableJuridiqueRepository.findAll();
	}

	@Override
	public ResponsableJuridique findOne(Long id) {
		return responsableJuridiqueRepository.findOne(id);
	}

	@Override
	public ResponsableJuridique save(ResponsableJuridique responsableJuridique) {
		return responsableJuridiqueRepository.save(responsableJuridique);
	}

}

package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.ResponsableJuridique;

public interface IResponsableJuridique {
	
	List<ResponsableJuridique> findAll();
	ResponsableJuridique findOne(Long id);
	ResponsableJuridique save(ResponsableJuridique reponsableJuridique);
	void delete(Long id);

}

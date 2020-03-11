package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Admin;

public interface IAdminService {
	
	List<Admin> findAll();
	Admin findOne(Long id);
	Admin save(Admin user);
	void delete(Long id);

}

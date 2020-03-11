package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Admin;

public interface AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public Admin findOne(Long id) {
		return adminRepository.findOne(id);
	}

	@Override
	public Admin save(Admin admin) {
		return adminRepository.save(admin);
	}

}

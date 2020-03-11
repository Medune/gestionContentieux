package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inti.entities.Admin;
import com.inti.service.interfaces.IAdminService;

public class AdminController {
	
	@Autowired
	IAdminService adminService;

	@RequestMapping(value = "admins", method = RequestMethod.GET)
	public List<Admin> findAll() {
		return adminService.findAll();
	}

	@RequestMapping(value = "admins/{idAdmin}", method = RequestMethod.GET)
	public Admin findOne(@PathVariable("idAdmin") Long id) {
		return adminService.findOne(id);
	}

	@RequestMapping(value = "admins", method = RequestMethod.POST)
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.save(admin);
	}

	@RequestMapping(value = "admins/{idAdmin}", method = RequestMethod.DELETE)
	public void deleteAdmin(@PathVariable("idAdmin") Long id) {
		adminService.delete(id);
	}

	@RequestMapping(value = "admins/{idAdmin}", method = RequestMethod.PUT) // PUT pour faire des mises à jour
	public Admin updateAdmin(@PathVariable("idAdmin") Long id, @RequestBody Admin user) {
		Admin currentAdmin = adminService.findOne(id);
		currentAdmin.setNomUtilisateur(user.getNomUtilisateur());
		currentAdmin.setPrenomUtilisateur(user.getPrenomUtilisateur());
		currentAdmin.setUsername(user.getUsername());
		currentAdmin.setPassword(user.getPassword());

		return adminService.save(currentAdmin);

	}

}

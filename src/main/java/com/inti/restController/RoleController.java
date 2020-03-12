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

import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@CrossOrigin
@RestController
public class RoleController {
	@Autowired
	IRoleService roleService;
	
	@GetMapping(value="roles")
	public List<Role> findAll(){
		return roleService.findAll();
	}
	@GetMapping(value="roles/{idRole}")
	public Role findOne(@PathVariable ("idRole")Long id) {
		return roleService.findOne(id);
	}
	@PostMapping(value="roles")
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}
	@DeleteMapping(value="roles/{idRole}")
	public void deleteRole(@PathVariable ("idRole")Long id) {
		roleService.delete(id);
	}
	@PutMapping(value="roles/{idRole}")
	public Role updateRole(@PathVariable ("idRole")Long id, @RequestBody Role role) {
		Role currentRole = roleService.findOne(id);
		currentRole.setLibelle(role.getLibelle());
		return roleService.save(currentRole);
	}
}

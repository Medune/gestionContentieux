package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}

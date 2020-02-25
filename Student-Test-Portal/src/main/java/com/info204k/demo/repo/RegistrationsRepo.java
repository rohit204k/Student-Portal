package com.info204k.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.Registrations;

public interface RegistrationsRepo extends JpaRepository<Registrations,String> {
	  

}

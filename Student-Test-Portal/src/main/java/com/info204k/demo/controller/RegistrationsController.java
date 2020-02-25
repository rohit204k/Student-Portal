package com.info204k.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Registrations;
import com.info204k.demo.repo.RegistrationsRepo;

@RestController
public class RegistrationsController {

		@Autowired
		RegistrationsRepo repo;
		
		@GetMapping(path="/register")
		public List<Registrations> getRegistrations()
		{
			return repo.findAll();
		}
		
		
		@PutMapping("/register")
		public Registrations UpdateRegistrations(@RequestBody Registrations register)
		{
			repo.save(register);
			return register;
		}
	}


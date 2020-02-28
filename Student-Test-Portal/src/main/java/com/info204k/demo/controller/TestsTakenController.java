package com.info204k.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.info204k.demo.model.Courses;
import com.info204k.demo.model.TestsTaken;
import com.info204k.demo.model.Student;
//import com.info204k.demo.model.Student;
import com.info204k.demo.repo.RegistrationsRepo;

@RestController
public class TestsTakenController {

		@Autowired
		RegistrationsRepo repo;
		
		@GetMapping(path="/register")
		@Query("select date from REGISRATIONS")
		public List<TestsTaken> getRegistrations()
		{
			return repo.findAll();
		}
		
		
		@PostMapping(path="/register",consumes= {"application/json"})
		public TestsTaken addRegistrations(@RequestBody TestsTaken register)
		{
			repo.save(register);
			return register;
		}
	}


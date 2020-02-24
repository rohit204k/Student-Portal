package com.info204k.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Student;
import com.info204k.demo.repo.StudentRepo;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepo repo;
	
	@GetMapping(path="/student")
	public List<Student> getStudent()
	{
		return repo.findAll();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		repo.save(student);
		return student;
	}
	}

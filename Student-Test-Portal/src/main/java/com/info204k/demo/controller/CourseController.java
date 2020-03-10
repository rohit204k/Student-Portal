package com.info204k.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Courses;
import com.info204k.demo.repo.CoursesRepo;
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CourseController 
{
	@Autowired
	CoursesRepo repo;
	@GetMapping(path="/courses")
	public List<Courses> getCourses()
	{
		return repo.findAll();
	}
	
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses courses)
	{
		repo.save(courses);
		return courses;
	}
}

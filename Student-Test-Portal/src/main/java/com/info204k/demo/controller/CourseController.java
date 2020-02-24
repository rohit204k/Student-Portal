package com.info204k.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Courses;
import com.info204k.demo.repo.CoursesRepo;

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
	public Date putDate(@RequestBody Date date)
	{
		
		return date;
	}
}

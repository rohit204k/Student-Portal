package com.info204k.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Courses;
import com.info204k.demo.repo.CoursesRepo;

@CrossOrigin(origins = { "/**" })
@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	CoursesRepo repo;

	// consumes = MediaType.APPLICATION_JSON_VALUE
	@GetMapping()
	public List<Courses> getCourses() {
		return repo.findAll();
	}

	// consumes = MediaType.APPLICATION_JSON_VALUE, produces =
	// MediaType.APPLICATION_JSON_VALUE
	@PutMapping()
	public Courses updateCourses(@RequestBody Courses courses) {
		return repo.save(courses);

	}
}

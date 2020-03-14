package com.info204k.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Student;
import com.info204k.demo.repo.StudentRepo;

@CrossOrigin(origins = { "/**" })
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo repo;

	@GetMapping()
	public List<Student> getStudents() {
		return repo.findAll();
	}

	@GetMapping(path = "/{studID}")
	@ResponseBody
	public Optional<Student> getStudent1(@PathVariable("studID") String studID) {
		return repo.findTopBystudID(studID);
	}

	@PostMapping()
	public Student addStudent(@RequestBody Student student) {
		return repo.save(student);
	}
}
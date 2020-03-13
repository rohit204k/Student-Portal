package com.info204k.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
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

	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudent() {
		return repo.findAll();
	}

	@GetMapping(path = "/{studID}")
	@ResponseBody
<<<<<<< HEAD
	public Optional<Student> getStudent(@PathVariable("studID") String studID) {
		return repo.findTopBystudID(studID);
=======
	public int getStudent(@PathVariable("studID") String studID) {
		return repo.countBystudID(studID);
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student addStudent(@RequestBody Student student) {
<<<<<<< HEAD
		return repo.save(student);
=======

		return repo.save(student);

>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	}
}
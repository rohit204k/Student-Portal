package com.info204k.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.info204k.demo.model.Questions;
import com.info204k.demo.repo.QuestionRepo;

@CrossOrigin(origins = { "/**" })
@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	QuestionRepo repo;

	
	@GetMapping()
	public List<Questions> getQuestions() {
		return repo.findAll();
	}

	
	@PostMapping()
	public Questions addQuestion(@RequestBody Questions question) {
		return repo.save(question);

	}

	@GetMapping(path = "/{subject}")
	@ResponseBody
	public List<Questions> getQuestions(@PathVariable("subject") String subject) {
		return repo.findAllBySubject(subject);
	}

}

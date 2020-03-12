package com.info204k.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Questions> getQuestions() {
		return repo.findAll();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Questions addQuestion(@RequestBody Questions question) {
		return repo.save(question);

	}

	@GetMapping(path = "/{subject}")
	@ResponseBody
	public ArrayList<String> getQuestions(@PathVariable("subject") String subject) {
		List<Questions> subque = repo.findAllBySubject(subject);
		ArrayList<String> ques = new ArrayList<String>();
		for (Questions q : subque)
			ques.add(q.getQuestion());
		return ques;
	}

}

package com.info204k.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.Questions;

public interface QuestionRepo extends JpaRepository<Questions, Integer> {

	List<Questions> findAllBySubject(String subject);

}

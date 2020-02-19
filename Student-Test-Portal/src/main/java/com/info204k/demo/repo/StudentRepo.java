package com.info204k.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.info204k.demo.Student;

@RepositoryRestResource()
public interface StudentRepo extends JpaRepository<Student,String>{
	

}

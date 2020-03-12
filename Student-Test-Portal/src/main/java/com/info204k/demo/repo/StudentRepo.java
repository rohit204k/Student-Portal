
package com.info204k.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.Student;

//@RepositoryRestResource(collectionResourceRel="student",path="student")
public interface StudentRepo extends JpaRepository<Student, String> {

	int countBystudID(String studID);

	Optional<Student> findTopBystudID(String studID);

}

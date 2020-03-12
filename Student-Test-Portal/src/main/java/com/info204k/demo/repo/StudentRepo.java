
package com.info204k.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, String> {

	int countBystudID(String studID);

}

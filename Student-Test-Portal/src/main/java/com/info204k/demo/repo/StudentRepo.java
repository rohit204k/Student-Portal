
package com.info204k.demo.repo;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.Student;

<<<<<<< HEAD
//@RepositoryRestResource(collectionResourceRel="student",path="student")
=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
public interface StudentRepo extends JpaRepository<Student, String> {

	int countBystudID(String studID);

<<<<<<< HEAD
	Optional<Student> findTopBystudID(String studID);

=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
}

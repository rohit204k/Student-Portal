
  package com.info204k.demo.repo;
  
  import org.springframework.data.jpa.repository.JpaRepository; 

  
  import com.info204k.demo.model.Courses;
  //@RepositoryRestResource(collectionResourceRel="courses",path="courses")  
  public interface CoursesRepo extends JpaRepository<Courses,String>
  
  {
  
  
  } 
 
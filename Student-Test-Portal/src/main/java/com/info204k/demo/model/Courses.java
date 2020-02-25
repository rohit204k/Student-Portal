
  package com.info204k.demo.model;
  
  import java.sql.Date;
  
  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.Id;
  
  @Entity public class Courses {

	  @Id 
	  private String CourseID; 
	  private String CourseName;

	  @Column(unique = true) 
	  private Date date; 
	  public String getCourseID() 
	  {
		  return CourseID; 
		  } 
	  public void setCourseID(String courseID) 
	  {
		  CourseID = courseID; } 
	  public String getCourseName() 
	  { 
		  return CourseName; } 
	  public void setCourseName(String courseName) 
	  { CourseName = courseName; } public Date
	  getDate() 
	  { return date; } public void setDate(Date date) { this.date = date;
	  } }
 
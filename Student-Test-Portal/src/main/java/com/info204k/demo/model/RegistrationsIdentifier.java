package com.info204k.demo.model;
import java.io.Serializable; import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
  
public class RegistrationsIdentifier implements Serializable
{
	@ManyToOne(cascade = CascadeType.ALL)
	private Student studID;
	@ManyToOne(cascade = CascadeType.ALL)
	private Courses CourseID; 
	private Date date;
	
	
	
	public Student getStudID() {
		return studID;
	}
	public void setStudID(Student studID) {
		this.studID = studID;
	}
	public Courses getCourseID() {
		return CourseID;
	}
	public void setCourseID(Courses courseID) {
		CourseID = courseID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
 
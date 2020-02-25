package com.info204k.demo.model;
import java.io.Serializable; import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
  
public class RegistrationsIdentifier implements Serializable
{
	@ManyToOne()
	private String studID;
	@ManyToOne()
	private String CourseID; 
	private Date date;
	
	
	
	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
 
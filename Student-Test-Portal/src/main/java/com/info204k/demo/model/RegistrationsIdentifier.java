package com.info204k.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class RegistrationsIdentifier implements Serializable{

	@ManyToMany
	private Student studID;
	@ManyToMany
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

	@Override
	public String toString() {
		return "RegistrationsIdentifier [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + "]";
	}
}

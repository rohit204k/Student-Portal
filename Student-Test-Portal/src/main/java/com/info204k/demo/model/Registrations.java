package com.info204k.demo.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@IdClass(RegistrationsIdentifier.class)
public class Registrations implements Serializable
{
	

	@Id
	@ManyToOne()
	private String studID;
	@Id
	@ManyToOne()
	private String CourseID; 
	@Id
	private Date date;
	private int score; 
	private	String TestTaken;
	
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

	public int getScore() 
	{ 
		return score;
	} 
	
	public void setScore(int score) 
	{ 
		this.score =score;
	} 
	
	public String getTestsTaken() 
	{ 
		return TestTaken; 
	} 
	
	public void setTestsTaken(String testsTaken) 
	{ 
		TestTaken = testsTaken;
	}
	
	@Override
	public String toString() {
		return "Registrations [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + ", score=" + score
				+ ", TestTaken=" + TestTaken + "]";
	}
	
  }
 
 package com.info204k.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Registerations {
	
	@ManyToMany
	private Student studID;
	@ManyToMany
	private Courses CourseID;
	private Date date;
	private int score;
	private String TestsTaken;
	
	
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
	public String getTestsTaken() {
		return TestsTaken;
	}
	public void setTestsTaken(String testsTaken) {
		TestsTaken = testsTaken;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "Registerations [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + ", TestsTaken="
				+ TestsTaken + ", score=" + score + "]";
	

	}
}

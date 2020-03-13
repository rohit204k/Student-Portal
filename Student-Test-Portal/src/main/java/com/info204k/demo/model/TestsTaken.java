package com.info204k.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@SuppressWarnings("serial")
@Entity
@IdClass(TestsIdentifier.class)
public class TestsTaken implements Serializable {

	@Id
	private String studID;
	@Id
	private String CourseID;
	@Id
	private Date date;
	private int score;

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "TestsTaken [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + ", score=" + score + "]";
=======
		return "Registrations [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + ", score=" + score
				+ "]";
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	}

}

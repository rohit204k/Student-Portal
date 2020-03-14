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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "TestsTaken [studID=" + studID + ", CourseID=" + CourseID + ", score=" + score + "]";
	}

}

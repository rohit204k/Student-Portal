package com.info204k.demo.model;
<<<<<<< HEAD

import java.io.Serializable;

import java.sql.Date;

@SuppressWarnings("serial")
public class TestsIdentifier implements Serializable {
	
=======

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.ManyToOne;

public class TestsIdentifier implements Serializable {
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	private String studID;
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
<<<<<<< HEAD
	
=======

>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	@Override
	public String toString() {
		return "TestsIdentifier [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + "]";
	}

}

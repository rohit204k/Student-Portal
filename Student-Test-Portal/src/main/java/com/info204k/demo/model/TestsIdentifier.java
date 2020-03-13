package com.info204k.demo.model;

import java.io.Serializable;

import java.sql.Date;

@SuppressWarnings("serial")
public class TestsIdentifier implements Serializable {
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

	@Override
	public String toString() {
		return "TestsIdentifier [studID=" + studID + ", CourseID=" + CourseID + ", date=" + date + "]";
	}

}

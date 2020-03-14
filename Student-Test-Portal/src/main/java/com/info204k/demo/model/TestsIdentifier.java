package com.info204k.demo.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TestsIdentifier implements Serializable {
	private String studID;
	private String CourseID;

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

	

	@Override
	public String toString() {
		return "TestsIdentifier [studID=" + studID + ", CourseID=" + CourseID + "]";
	}

}


package com.info204k.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	private String CourseID;
	
	private String CourseName;

	
	public String getCourseID() {
		return CourseID;
	}

	public void setCourseID(String courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}


	@Override
	public String toString() {
		return "Courses [CourseID=" + CourseID + ", CourseName=" + CourseName + "]";
	}
}


package com.info204k.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Courses [CourseID=" + CourseID + ", CourseName=" + CourseName + ", date=" + date + "]";
	}

=======
>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
	@Id
	private String CourseID;
	private String CourseName;

	@Column(unique = true)
	private Date date;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
<<<<<<< HEAD
=======

	@Override
	public String toString() {
		return "Courses [CourseID=" + CourseID + ", CourseName=" + CourseName + ", date=" + date + "]";
	}

>>>>>>> dec7140559e15d49cf651c243f51ca17b72cb6c2
}

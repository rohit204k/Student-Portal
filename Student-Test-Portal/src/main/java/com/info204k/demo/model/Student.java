package com.info204k.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student info")
public class Student {
	@Id
	private String studID;
	private String fName;
	private String lName;
	private String email;
	private String password;
	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [studID=" + studID + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + "]";
	}
	

}

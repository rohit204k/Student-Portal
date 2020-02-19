 package com.info204k.demo.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Registered {
	
	@ManyToMany
	private Student studID;
	@ManyToMany
	private UpcomingTests subId;
	public Student getStudID() {
		return studID;
	}
	public void setStudID(Student studID) {
		this.studID = studID;
	}
	public UpcomingTests getSubId() {
		return subId;
	}
	public void setSubId(UpcomingTests subId) {
		this.subId = subId;
	}
	@Override
	public String toString() {
		return "Registered [studID=" + studID + ", subId=" + subId + "]";
	}
	
	

}

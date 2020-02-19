package com.info204k.demo.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class TestsTaken 
{
	@ManyToMany
	private String studId;
	@ManyToMany
	private String subId;
	private int score;
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "TestsTaken [studId=" + studId + ", subId=" + subId + ", score=" + score + "]";
	}
	
	
}

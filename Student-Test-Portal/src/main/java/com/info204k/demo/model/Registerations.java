 package com.info204k.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Registerations {
	
	@EmbeddedId
	private RegistrationsIdentifier regID;
	private int score;
	private String TestsTaken;
	
	public RegistrationsIdentifier getRegID() {
		return regID;
	}
	public void setRegID(RegistrationsIdentifier regID) {
		this.regID = regID;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTestsTaken() {
		return TestsTaken;
	}
	public void setTestsTaken(String testsTaken) {
		TestsTaken = testsTaken;
	}
	
	
	@Override
	public String toString() {
		return "Registerations [regID=" + regID + ", score=" + score + ", TestsTaken=" + TestsTaken + "]";
	}
	
}

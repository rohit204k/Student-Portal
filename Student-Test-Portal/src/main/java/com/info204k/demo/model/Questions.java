package com.info204k.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
	private int qno;
	private String question;
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private char ans;

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [qno=" + qno + ", question=" + question + ", subject=" + subject + ", ans=" + ans + "]";
	}

	public char getAns() {
		return ans;
	}

	public void setAns(char ans) {
		this.ans = ans;
	}
}

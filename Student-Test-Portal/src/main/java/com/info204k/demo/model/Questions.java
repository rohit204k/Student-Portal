package com.info204k.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
	
	private int qno;
	@Id
	private String question;
	private String a,b,c,d;
	private char ans;
	private String subject;
	
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
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public char getAns() {
		return ans;
	}
	public void setAns(char ans) {
		this.ans = ans;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Questions [qno=" + qno + ", question=" + question + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", ans=" + ans + ", subject=" + subject + "]";
	}

}
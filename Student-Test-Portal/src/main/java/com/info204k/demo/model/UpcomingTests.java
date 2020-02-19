package com.info204k.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class UpcomingTests 
{
	@Id
	@GeneratedValue
	@Column(nullable=false)
	private String subId;
	private String subName;
	private Date date;
	
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UpcomingTests [subId=" + subId + ", subName=" + subName + ", date=" + date + "]";
	}
	
}

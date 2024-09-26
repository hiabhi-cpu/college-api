package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ResultClass {
	private String college_name;
	private String course_name;
	private int fees;
	private int duration;
	private String type;
	private int acc_fees;
	public ResultClass(String college_name, String course_name, int fees, int duration, String type, int acc_fees) {
		super();
		this.college_name = college_name;
		this.course_name = course_name;
		this.fees = fees;
		this.duration = duration;
		this.type = type;
		this.acc_fees = acc_fees;
	}
	public ResultClass() {
		super();
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAcc_fees() {
		return acc_fees;
	}
	public void setAcc_fees(int acc_fees) {
		this.acc_fees = acc_fees;
	}
	@Override
	public String toString() {
		return "ResultClass [college_name=" + college_name + ", course_name=" + course_name + ", fees=" + fees
				+ ", duration=" + duration + ", type=" + type + ", acc_fees=" + acc_fees + "]";
	}
	
}

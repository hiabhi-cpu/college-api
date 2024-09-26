package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "accommodation")
public class Accommodation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accId;
	private String type;
	private int accFees;
	@ManyToOne
	@JoinColumn(name = "course_id")
	@JsonIgnore
	private Course course;
	public Accommodation(int accId, String type, int accFees, Course course) {
		super();
		this.accId = accId;
		this.type = type;
		this.accFees = accFees;
		this.course = course;
	}
	public Accommodation() {
		super();
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAccFees() {
		return accFees;
	}
	public void setAccFees(int accFees) {
		this.accFees = accFees;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}

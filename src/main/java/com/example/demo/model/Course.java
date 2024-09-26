package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private int duration;
	private int fees;
	@ManyToOne
	@JoinColumn(name = "college_id")
	@JsonIgnore
	private College college;
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	
	private List<Accommodation> accommodations;
	public Course(int courseId, String courseName, int duration, int fees, College college,
			List<Accommodation> accommodations) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		this.college = college;
		this.accommodations = accommodations;
	}
	public Course() {
		super();
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Accommodation> getAccommodations() {
		return accommodations;
	}
	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fees="
				+ fees + ", college=" + college + ", accommodations=" + accommodations + "]";
	}
	
	
}

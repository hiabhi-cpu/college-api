package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.College;
import com.example.demo.model.Course;
import com.example.demo.repository.CollegeRepo;
import com.example.demo.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CollegeRepo collegeRepo;

	public Course addCourse(Course course,int collegeid) {
		// TODO Auto-generated method stub
		Optional<College> college=collegeRepo.findById(collegeid);
		if(college.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
		course.setCollege(college.get());
		return courseRepo.save(course);
	}
}

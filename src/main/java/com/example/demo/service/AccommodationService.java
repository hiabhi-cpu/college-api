package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Accommodation;
import com.example.demo.model.Course;
import com.example.demo.repository.AccommodationRepo;
import com.example.demo.repository.CourseRepo;

@Service
public class AccommodationService {
	
	@Autowired
	AccommodationRepo accRepo;
	
	@Autowired
	CourseRepo courseRepo;

	public Accommodation addAcc(Accommodation acc, int courseId) {
		// TODO Auto-generated method stub
		Optional<Course> course=courseRepo.findById(courseId);
		if(course.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
		acc.setCourse(course.get());
		return accRepo.save(acc);
	}
}

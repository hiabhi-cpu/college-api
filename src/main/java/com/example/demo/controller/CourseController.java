package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@PostMapping("{collegeid}/add")
	public ResponseEntity<Course> addCourse(@RequestBody Course course,@PathVariable int collegeid){
		return new ResponseEntity<Course>(courseService.addCourse(course,collegeid),HttpStatus.OK);
	}
}

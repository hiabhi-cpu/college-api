package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.model.ResultClass;
import com.example.demo.service.CollegeService;

@RestController
@RequestMapping("college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("add")
	public ResponseEntity<College> addCollege(@RequestBody College college) {
		return new ResponseEntity<College>(collegeService.addCollege(college),HttpStatus.OK);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<ResultClass>> getAllColleges(){
		return new ResponseEntity<List<ResultClass>>(collegeService.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("getcourse")
	public ResponseEntity<List<ResultClass>> findCollegeCourse(@RequestParam String coursename){
		return new ResponseEntity<List<ResultClass>>(collegeService.getCollegeCourse(coursename),HttpStatus.OK);
	}
}

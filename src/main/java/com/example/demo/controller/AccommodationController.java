package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Accommodation;
import com.example.demo.service.AccommodationService;

@RestController
@RequestMapping("acc")
public class AccommodationController {
	
	@Autowired
	AccommodationService service;
	
	@PostMapping("{courseId}/add")
	public ResponseEntity<Accommodation> addAcc(@RequestBody Accommodation acc,@PathVariable int courseId){
		return new ResponseEntity<Accommodation>(service.addAcc(acc,courseId),HttpStatus.OK);
	}
}

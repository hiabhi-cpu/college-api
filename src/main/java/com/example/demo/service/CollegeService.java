package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Accommodation;
import com.example.demo.model.College;
import com.example.demo.model.Course;
import com.example.demo.model.ResultClass;
import com.example.demo.repository.CollegeRepo;

@Service
public class CollegeService {
	
	@Autowired
	CollegeRepo collegeRepo;

	public College addCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepo.save(college);
	}

	public List<ResultClass> getAll() {
		// TODO Auto-generated method stub
		List<College> colleges=collegeRepo.findAll();
		List<ResultClass> result=new ArrayList<>();
		for(College c:colleges) {
			for(Course cr:c.getCourses()) {
				for(Accommodation a:cr.getAccommodations()) {
					ResultClass temp=new ResultClass(c.getName(), cr.getCourseName(), cr.getFees(), cr.getDuration(), a.getType(), a.getAccFees());
					result.add(temp);
				}
			}
		}
		return result;
	}

	public List<ResultClass> getCollegeCourse(String coursename) {
		// TODO Auto-generated method stub
		List<College> colleges=collegeRepo.findAll();
		List<ResultClass> result=new ArrayList<>();
		for(College c:colleges) {
			for(Course cr:c.getCourses()) {
				if(cr.getCourseName().equalsIgnoreCase(coursename)) {
					for(Accommodation a:cr.getAccommodations()) {
						ResultClass temp=new ResultClass(c.getName(), cr.getCourseName(), cr.getFees(), cr.getDuration(), a.getType(), a.getAccFees());
						result.add(temp);
					}
					
				}
			}
		}
		return result;
	}
}

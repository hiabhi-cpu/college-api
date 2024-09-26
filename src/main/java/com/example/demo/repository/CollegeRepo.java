package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.College;
import com.example.demo.model.ResultClass;

@Repository
public interface CollegeRepo extends JpaRepository<College, Integer>{


}

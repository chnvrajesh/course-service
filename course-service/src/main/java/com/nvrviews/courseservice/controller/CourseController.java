package com.nvrviews.courseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvrviews.courseservice.entity.Course;
import com.nvrviews.courseservice.service.CourseService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/")
	public Course saveCourse(@RequestBody Course course) {
		System.out.print("COurse Service > save Course");
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable("id") Long courseId) {
		return courseService.getCourseById(courseId);
	}

}

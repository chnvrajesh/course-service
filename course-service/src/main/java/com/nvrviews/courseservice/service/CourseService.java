package com.nvrviews.courseservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvrviews.courseservice.entity.Course;
import com.nvrviews.courseservice.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	public Course getCourseById(Long courseId) {
		// TODO Auto-generated method stub
		return courseRepository.findByCourseId(courseId);
	}
}

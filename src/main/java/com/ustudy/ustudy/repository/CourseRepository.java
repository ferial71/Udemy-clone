package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

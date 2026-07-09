package com.example.mailer.service.event;

import com.example.mailer.entities.Course;
import com.example.mailer.repository.model.JCourse;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public Course toModel(JCourse jCourse) {
        return new Course(
                jCourse.getId(),
                jCourse.getTitle(),
                jCourse.getStart(),
                jCourse.getEnd());
    }
}
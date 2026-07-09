package com.example.mailer.service.event;

import com.example.mailer.entities.Course;
import com.example.mailer.repository.CourseRepository;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {
  private final CourseMapper mapper;
  private final CourseRepository repository;

  public Course getById(UUID id) {
    return mapper.toModel(
        repository.findById(id).orElseThrow(() -> new RuntimeException("Course not found")));
  }
}

package com.example.mailer.entities;

import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Subscription {
  private UUID id;
  private User user;
  private Course course;
  private Instant createdAt;
}

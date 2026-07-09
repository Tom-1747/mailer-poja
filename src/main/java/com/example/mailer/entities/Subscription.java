package com.example.mailer.entities;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
public class Subscription {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne private User user;

  @ManyToOne private Course course;

  private Instant createdAt;
}

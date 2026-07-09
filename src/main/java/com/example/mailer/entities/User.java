package com.example.mailer.entities;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
  private UUID id;
  private String firstname;
  private String lastname;
  private String username;
  private String email;
}

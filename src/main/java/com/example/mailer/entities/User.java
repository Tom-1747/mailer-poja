package com.example.mailer.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

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

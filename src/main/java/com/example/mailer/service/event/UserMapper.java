package com.example.mailer.service.event;

import com.example.mailer.entities.User;
import com.example.mailer.repository.model.JUser;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toModel(JUser jUser) {
        return new User(
                jUser.getId(),
                jUser.getFirstName(),
                jUser.getLastName(),
                jUser.getUserName(),
                jUser.getEmail());
    }
}

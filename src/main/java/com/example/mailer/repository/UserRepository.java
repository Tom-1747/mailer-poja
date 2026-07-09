package com.example.mailer.repository;

import com.example.mailer.repository.model.JUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<JUser, UUID> {
}

package com.example.mailer.repository;

import com.example.mailer.repository.model.JSubscription;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<JSubscription, UUID> {
    List<JSubscription> findByCourseId(UUID courseId);
}
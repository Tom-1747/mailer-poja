package com.example.mailer.endpoint.controller;

import com.example.mailer.service.event.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/courses")
public class CourseController {

    private final SubscriptionService subscriptionService;

    @PostMapping("/{id}/notify")
    public void notifySubscribers(@PathVariable UUID id) {

        subscriptionService.notifySubscribers(id);

    }
}

package com.example.mailer.endpoint.controller;

import com.example.mailer.mail.Email;
import com.example.mailer.mail.Mailer;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MailController {

  private final Mailer mailer;

  @GetMapping("/mail")
  @SneakyThrows
  public String sendMail(@RequestParam String to) {
    var email =
        new Email(
            new InternetAddress(to),
            List.of(),
            List.of(),
            "Test depuis mon mailer",
            "<p>Hello, ceci est un test !</p>",
            List.of());
    mailer.accept(email);
    return "Mail envoyé à " + to;
  }
}

package com.example.mailer.service.event;

import com.example.mailer.mail.Email;
import com.example.mailer.mail.Mailer;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {

  private final Mailer mailer;

  @SneakyThrows
  public void sendMail(String to, String subject, String html) {
    InternetAddress recipient = new InternetAddress(to);
    mailer.accept(new Email(recipient, List.of(), List.of(), subject, html, List.of()));
  }
}

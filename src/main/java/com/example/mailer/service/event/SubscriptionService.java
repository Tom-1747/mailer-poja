package com.example.mailer.service.event;

import com.example.mailer.repository.SubscriptionRepository;
import com.example.mailer.repository.model.JSubscription;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubscriptionService {

  private final SubscriptionRepository subscriptionRepository;
  private final MailService mailService;
  private final UserMapper userMapper;

  public void notifySubscribers(UUID courseId) {
    List<JSubscription> subscriptions = subscriptionRepository.findByCourseId(courseId);

    for (JSubscription subscription : subscriptions) {
      var user = userMapper.toModel(subscription.getUser());

      mailService.sendMail(
          user.getEmail(),
          "Nouvelle information sur votre cours",
          """
          Bonjour %s,

          Une nouvelle mise à jour est disponible.

          Merci.
          """
              .formatted(user.getFirstname()));
    }
  }
}

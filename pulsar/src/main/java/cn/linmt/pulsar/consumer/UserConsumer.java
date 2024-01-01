package cn.linmt.pulsar.consumer;

import cn.linmt.pulsar.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.api.SubscriptionType;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Slf4j
@Service
public class UserConsumer {

  @PulsarListener(
      subscriptionName = "user-topic-subscription",
      topics = "USER_TOPIC",
      subscriptionType = SubscriptionType.Shared)
  public void stringTopicListener(User user) {
    log.info("Received User message: {}", user);
  }
}

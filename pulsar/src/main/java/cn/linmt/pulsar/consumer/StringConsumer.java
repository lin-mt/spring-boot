package cn.linmt.pulsar.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.api.SubscriptionType;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Slf4j
@Service
public class StringConsumer {

  @PulsarListener(
      subscriptionName = "string-topic-subscription",
      topics = "STRING_TOPIC",
      subscriptionType = SubscriptionType.Shared)
  public void stringTopicListener(String str) {
    log.info("Received String message: {}", str);
  }
}

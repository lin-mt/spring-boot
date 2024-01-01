package cn.linmt.pulsar.producer;

import cn.linmt.pulsar.entity.User;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.api.MessageId;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class UserProducer {

  private final PulsarTemplate<User> template;

  @Scheduled(cron = "*/5 * * * * ?")
  public void producer() throws PulsarClientException {
    User user = new User().setFirstName("firstName").setEmail(LocalDateTime.now().toString());
    MessageId messageId = template.send("USER_TOPIC", user);
    log.info("producer messageId:{}，message:{}", messageId, user);
  }
}

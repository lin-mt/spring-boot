package cn.linmt.pulsar.producer;

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
public class StringProducer {

  private final PulsarTemplate<String> template;

  @Scheduled(cron = "*/3 * * * * ?")
  public void producer() throws PulsarClientException {
    LocalDateTime message = LocalDateTime.now();
    MessageId messageId = template.send("STRING_TOPIC", message.toString());
    log.info("producer messageId:{}，message:{}", messageId, message);
  }
}

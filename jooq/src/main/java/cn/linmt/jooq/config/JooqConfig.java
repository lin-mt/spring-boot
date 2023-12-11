package cn.linmt.jooq.config;

import org.jooq.impl.DefaultExecuteListenerProvider;
import org.jooq.impl.DefaultRecordListenerProvider;
import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Configuration
public class JooqConfig {

  @Bean
  public DefaultConfigurationCustomizer configurationCustomizer() {
    return configuration -> {
      configuration.set(new DefaultRecordListenerProvider(new JooqRecordListener()));
      configuration.set(new DefaultExecuteListenerProvider(new JooqExecuteListener()));
    };
  }
}

package cn.linmt.pulsar.config;

import cn.linmt.pulsar.entity.User;
import org.apache.pulsar.client.api.Schema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.pulsar.core.DefaultSchemaResolver;
import org.springframework.pulsar.core.SchemaResolver;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Configuration
public class ServerConfig {

  @Bean
  public SchemaResolver.SchemaResolverCustomizer<DefaultSchemaResolver> schemaResolverCustomizer() {
    return (schemaResolver) ->
        schemaResolver.addCustomSchemaMapping(User.class, Schema.JSON(User.class));
  }
}

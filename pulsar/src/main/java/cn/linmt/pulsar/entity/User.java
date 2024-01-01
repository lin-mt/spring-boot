package cn.linmt.pulsar.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Data
@Accessors(chain = true)
public class User {
  private String email;
  private String firstName;
}

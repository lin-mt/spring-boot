package cn.linmt.jooq.config;

import lombok.extern.slf4j.Slf4j;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteListener;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Slf4j
public class JooqExecuteListener implements ExecuteListener {
  @Override
  public void executeStart(ExecuteContext ctx) {}
}

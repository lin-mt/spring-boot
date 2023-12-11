package cn.linmt.jooq.config;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.slf4j.Slf4j;
import org.jooq.RecordContext;
import org.jooq.RecordListener;
import org.jooq.impl.DSL;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@Slf4j
public class JooqRecordListener implements RecordListener {

  @Override
  public void insertStart(RecordContext ctx) {
    ctx.record().setValue(DSL.field("id"), ThreadLocalRandom.current().nextLong());
    ctx.record().setValue(DSL.field("created_by"), 1);
    ctx.record().setValue(DSL.field("modified_by"), 2);
    ctx.record().setValue(DSL.field("gmt_created"), LocalDateTime.now());
    ctx.record().setValue(DSL.field("gmt_modified"), LocalDateTime.now());
  }

  @Override
  public void insertEnd(RecordContext ctx) {}
}

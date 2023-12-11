package cn.linmt.jooq;

import static cn.linmt.jooq.generate.Tables.T_BOOK;

import cn.linmt.jooq.generate.tables.records.BookRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.types.ULong;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class JooqApplication implements CommandLineRunner {

  private final DSLContext dslContext;

  public static void main(String[] args) {
    SpringApplication.run(JooqApplication.class, args);
  }

  @Override
  public void run(String... args) {
    BookRecord bookRecord = dslContext.newRecord(T_BOOK);
    bookRecord.setBookName("书名");
    bookRecord.setAuthorId(ULong.valueOf(999L));
    bookRecord.insert();
  }
}

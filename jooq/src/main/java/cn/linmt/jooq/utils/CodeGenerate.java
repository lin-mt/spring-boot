package cn.linmt.jooq.utils;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.ForcedType;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
public class CodeGenerate {

  public static void main(String[] args) {
    Configuration configuration =
        new Configuration()
            .withJdbc(
                new Jdbc()
                    .withDriver("com.mysql.cj.jdbc.Driver")
                    .withUrl(
                        "jdbc:mysql://localhost:3306/spring_boot?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true")
                    .withUser("root")
                    .withPassword("root93633"))
            .withGenerator(
                new Generator()
                    .withGenerate(new Generate().withDaos(true))
                    .withDatabase(
                        new Database()
                            .withName("org.jooq.meta.mysql.MySQLDatabase")
                            .withIncludes(".*")
                            .withInputSchema("spring_boot")
                            .withForcedTypes(
                                new ForcedType()
                                    .withAuditInsertTimestamp(true)
                                    .withIncludeExpression("CREATED_BY"),
                                new ForcedType()
                                    .withAuditInsertUser(true)
                                    .withIncludeExpression("MODIFIED_BY"),
                                new ForcedType()
                                    .withAuditUpdateTimestamp(true)
                                    .withIncludeExpression("GMT_CREATE"),
                                new ForcedType()
                                    .withAuditUpdateUser(true)
                                    .withIncludeExpression("GMT_MODIFIED")))
                    .withTarget(
                        new Target()
                            .withPackageName("cn.linmt.jooq.generate")
                            .withDirectory("jooq/src/main/java")));
    try {
      GenerationTool.generate(configuration);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

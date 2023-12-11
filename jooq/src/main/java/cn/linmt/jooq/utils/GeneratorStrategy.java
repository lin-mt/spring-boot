package cn.linmt.jooq.utils;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;
import org.jooq.meta.TableDefinition;

/**
 * @author <a href="mailto:lin-mt@outlook.com">lin-mt</a>
 */
@SuppressWarnings("unused")
public class GeneratorStrategy extends DefaultGeneratorStrategy {

  @Override
  public String getJavaIdentifier(Definition definition) {
    return "T_" + super.getJavaIdentifier(definition);
  }

  @Override
  public String getJavaClassName(Definition definition, Mode mode) {
    String javaClassName = super.getJavaClassName(definition, mode);
    if (Mode.DEFAULT.equals(mode)
        && TableDefinition.class.isAssignableFrom(definition.getClass())) {
      return "Table" + javaClassName;
    }
    return javaClassName;
  }
}

/*
 * This file is generated by jOOQ.
 */
package cn.linmt.jooq.generate;


import cn.linmt.jooq.generate.tables.TableBook;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpringBoot extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>spring_boot</code>
     */
    public static final SpringBoot T_SPRING_BOOT = new SpringBoot();

    /**
     * The table <code>spring_boot.book</code>.
     */
    public final TableBook T_BOOK = TableBook.T_BOOK;

    /**
     * No further instances allowed
     */
    private SpringBoot() {
        super("spring_boot", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            TableBook.T_BOOK
        );
    }
}

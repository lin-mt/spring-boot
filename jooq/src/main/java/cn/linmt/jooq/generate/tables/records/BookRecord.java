/*
 * This file is generated by jOOQ.
 */
package cn.linmt.jooq.generate.tables.records;


import cn.linmt.jooq.generate.tables.TableBook;
import cn.linmt.jooq.generate.tables.pojos.Book;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record7<ULong, String, ULong, ULong, ULong, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>spring_boot.book.id</code>. 主键ID
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.book.id</code>. 主键ID
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>spring_boot.book.book_name</code>. 书名
     */
    public void setBookName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.book.book_name</code>. 书名
     */
    public String getBookName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.book.author_id</code>. 作者ID
     */
    public void setAuthorId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.book.author_id</code>. 作者ID
     */
    public ULong getAuthorId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>spring_boot.book.created_by</code>. 创建者
     */
    public void setCreatedBy(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.book.created_by</code>. 创建者
     */
    public ULong getCreatedBy() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>spring_boot.book.modified_by</code>. 更新者
     */
    public void setModifiedBy(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.book.modified_by</code>. 更新者
     */
    public ULong getModifiedBy() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>spring_boot.book.gmt_created</code>. 创建时间
     */
    public void setGmtCreated(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.book.gmt_created</code>. 创建时间
     */
    public LocalDateTime getGmtCreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>spring_boot.book.gmt_modified</code>. 更新时间
     */
    public void setGmtModified(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.book.gmt_modified</code>. 更新时间
     */
    public LocalDateTime getGmtModified() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return TableBook.T_BOOK.T_ID;
    }

    @Override
    public Field<String> field2() {
        return TableBook.T_BOOK.T_BOOK_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return TableBook.T_BOOK.T_AUTHOR_ID;
    }

    @Override
    public Field<ULong> field4() {
        return TableBook.T_BOOK.T_CREATED_BY;
    }

    @Override
    public Field<ULong> field5() {
        return TableBook.T_BOOK.T_MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return TableBook.T_BOOK.T_GMT_CREATED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TableBook.T_BOOK.T_GMT_MODIFIED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBookName();
    }

    @Override
    public ULong component3() {
        return getAuthorId();
    }

    @Override
    public ULong component4() {
        return getCreatedBy();
    }

    @Override
    public ULong component5() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component6() {
        return getGmtCreated();
    }

    @Override
    public LocalDateTime component7() {
        return getGmtModified();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBookName();
    }

    @Override
    public ULong value3() {
        return getAuthorId();
    }

    @Override
    public ULong value4() {
        return getCreatedBy();
    }

    @Override
    public ULong value5() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value6() {
        return getGmtCreated();
    }

    @Override
    public LocalDateTime value7() {
        return getGmtModified();
    }

    @Override
    public BookRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public BookRecord value2(String value) {
        setBookName(value);
        return this;
    }

    @Override
    public BookRecord value3(ULong value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public BookRecord value4(ULong value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BookRecord value5(ULong value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public BookRecord value6(LocalDateTime value) {
        setGmtCreated(value);
        return this;
    }

    @Override
    public BookRecord value7(LocalDateTime value) {
        setGmtModified(value);
        return this;
    }

    @Override
    public BookRecord values(ULong value1, String value2, ULong value3, ULong value4, ULong value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(TableBook.T_BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(ULong id, String bookName, ULong authorId, ULong createdBy, ULong modifiedBy, LocalDateTime gmtCreated, LocalDateTime gmtModified) {
        super(TableBook.T_BOOK);

        setId(id);
        setBookName(bookName);
        setAuthorId(authorId);
        setCreatedBy(createdBy);
        setModifiedBy(modifiedBy);
        setGmtCreated(gmtCreated);
        setGmtModified(gmtModified);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Book value) {
        super(TableBook.T_BOOK);

        if (value != null) {
            setId(value.getId());
            setBookName(value.getBookName());
            setAuthorId(value.getAuthorId());
            setCreatedBy(value.getCreatedBy());
            setModifiedBy(value.getModifiedBy());
            setGmtCreated(value.getGmtCreated());
            setGmtModified(value.getGmtModified());
            resetChangedOnNotNull();
        }
    }
}

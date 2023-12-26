/*
 * This file is generated by jOOQ.
 */
package cn.linmt.jooq.generate.tables.daos;


import cn.linmt.jooq.generate.AbstractSpringDAOImpl;
import cn.linmt.jooq.generate.tables.TableBook;
import cn.linmt.jooq.generate.tables.pojos.Book;
import cn.linmt.jooq.generate.tables.records.BookRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class BookDao extends AbstractSpringDAOImpl<BookRecord, Book, Long> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(TableBook.T_BOOK, Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    @Autowired
    public BookDao(Configuration configuration) {
        super(TableBook.T_BOOK, Book.class, configuration);
    }

    @Override
    public Long getId(Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Book> fetchById(Long... values) {
        return fetch(TableBook.T_BOOK.T_ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Book fetchOneById(Long value) {
        return fetchOne(TableBook.T_BOOK.T_ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<Book> fetchOptionalById(Long value) {
        return fetchOptional(TableBook.T_BOOK.T_ID, value);
    }

    /**
     * Fetch records that have <code>book_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfBookName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_BOOK_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>book_name IN (values)</code>
     */
    public List<Book> fetchByBookName(String... values) {
        return fetch(TableBook.T_BOOK.T_BOOK_NAME, values);
    }

    /**
     * Fetch records that have <code>author_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfAuthorId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_AUTHOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    public List<Book> fetchByAuthorId(Long... values) {
        return fetch(TableBook.T_BOOK.T_AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfCreatedBy(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<Book> fetchByCreatedBy(Long... values) {
        return fetch(TableBook.T_BOOK.T_CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>modified_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfModifiedBy(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_MODIFIED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modified_by IN (values)</code>
     */
    public List<Book> fetchByModifiedBy(Long... values) {
        return fetch(TableBook.T_BOOK.T_MODIFIED_BY, values);
    }

    /**
     * Fetch records that have <code>gmt_created BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfGmtCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_GMT_CREATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>gmt_created IN (values)</code>
     */
    public List<Book> fetchByGmtCreated(LocalDateTime... values) {
        return fetch(TableBook.T_BOOK.T_GMT_CREATED, values);
    }

    /**
     * Fetch records that have <code>gmt_modified BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Book> fetchRangeOfGmtModified(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TableBook.T_BOOK.T_GMT_MODIFIED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>gmt_modified IN (values)</code>
     */
    public List<Book> fetchByGmtModified(LocalDateTime... values) {
        return fetch(TableBook.T_BOOK.T_GMT_MODIFIED, values);
    }
}

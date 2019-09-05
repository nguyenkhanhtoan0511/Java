package com.nokia.hibernate.dao;

import com.nokia.hibernate.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> findAll();

    Book getBook(String title);

    void add(Book book);

    void update(Book book);

    void delete(Book book);

    Book findById(long id);

    void deleteAll();

}

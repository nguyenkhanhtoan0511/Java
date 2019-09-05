package com.nokia.hibernate.dao;

import com.nokia.hibernate.entity.Author;

import java.util.List;

public interface AuthorDAO {
    List<Author> findAll();

    Author getAuthor(String name);

    void add(Author author);

    void update(Author author);

    void delete(Author author);

    Author findById(long id);

    void deleteAll();

}

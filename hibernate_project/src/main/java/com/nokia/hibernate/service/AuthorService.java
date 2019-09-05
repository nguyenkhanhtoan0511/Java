package com.nokia.hibernate.service;

import com.nokia.hibernate.dao.impl.AuthorDAOImpl;
import com.nokia.hibernate.entity.Author;

import java.util.List;

public class AuthorService {
    private static AuthorDAOImpl authorDAOImpl;

    public AuthorService(){
        this.authorDAOImpl = new AuthorDAOImpl();
    }

    public List<Author> findAll(){
        authorDAOImpl.openCurrentSession();
        List<Author> authors = authorDAOImpl.findAll();
        authorDAOImpl.closeCurrentSession();
        return authors;
    }

    public void add(Author author){
        authorDAOImpl.openCurrentSessionwithTransaction();
        authorDAOImpl.add(author);
        authorDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void update(Author author){
        authorDAOImpl.openCurrentSessionwithTransaction();
        authorDAOImpl.update(author);
        authorDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void delete(Author author){
        authorDAOImpl.openCurrentSessionwithTransaction();
        authorDAOImpl.delete(author);
        authorDAOImpl.closeCurrentSessionwithTransaction();
    }

    public Author findById(long id){
        authorDAOImpl.openCurrentSession();
        Author author = authorDAOImpl.findById(id);
        authorDAOImpl.closeCurrentSession();
        return author;
    }

    public Author getAuthor(String name){
        authorDAOImpl.openCurrentSession();
        Author author = authorDAOImpl.getAuthor(name);
        authorDAOImpl.closeCurrentSession();
        return author;
    }


    public void deleteAll(){
        authorDAOImpl.openCurrentSessionwithTransaction();
        authorDAOImpl.deleteAll();
        authorDAOImpl.closeCurrentSessionwithTransaction();
    }

}

package com.nokia.hibernate.service;

import com.nokia.hibernate.dao.impl.BookDAOImpl;
import com.nokia.hibernate.entity.Book;

import java.util.List;

public class BookService {
    private static BookDAOImpl bookDAOImpl;

    public BookService(){
        this.bookDAOImpl = new BookDAOImpl();
    }

    public List<Book> findAll(){
        bookDAOImpl.openCurrentSession();
        List<Book> books = bookDAOImpl.findAll();
        bookDAOImpl.closeCurrentSession();
        return books;
    }

    public void add(Book book){
        bookDAOImpl.openCurrentSessionwithTransaction();
        bookDAOImpl.add(book);
        bookDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void update(Book book){
        bookDAOImpl.openCurrentSessionwithTransaction();
        bookDAOImpl.update(book);
        bookDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void delete(Book book){
        bookDAOImpl.openCurrentSessionwithTransaction();
        bookDAOImpl.delete(book);
        bookDAOImpl.closeCurrentSessionwithTransaction();
    }

    public Book findById(long id){
        bookDAOImpl.openCurrentSession();
        Book book = bookDAOImpl.findById(id);
        bookDAOImpl.closeCurrentSession();
        return book;
    }

    public Book getBook(String title){
        bookDAOImpl.openCurrentSession();
        Book book = bookDAOImpl.getBook(title);
        bookDAOImpl.closeCurrentSession();
        return book;
    }


    public void deleteAll(){
        bookDAOImpl.openCurrentSessionwithTransaction();
        bookDAOImpl.deleteAll();
        bookDAOImpl.closeCurrentSessionwithTransaction();
    }

}

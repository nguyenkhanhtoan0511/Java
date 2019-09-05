package com.nokia.hibernate.dao.impl;

import com.nokia.hibernate.dao.BookDAO;
import com.nokia.hibernate.entity.Book;

import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class BookDAOImpl implements BookDAO {

    private Session currentSession;

    public BookDAOImpl(){
    }

    public Session openCurrentSession(){
        currentSession = HibernateUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction(){
        currentSession = HibernateUtil.getSessionFactory().openSession();
        currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession(){
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction(){
        currentSession.getTransaction().commit();
        currentSession.close();
    }

    public void setCurrentSession(Session session){
        this.currentSession = session;
    }

    public Session getCurrentSession(){
        return currentSession;
    }

    @Override
    public List<Book> findAll() {
        try {
            Query query = getCurrentSession().createQuery("from Book");
            List<Book> books = query.list();
            return books;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Book getBook(String title) {
        try {
            Query query = getCurrentSession().createQuery("from Book where title = :title");
            query.setParameter("title", title);
            List<Book> models = query.list();
            return (models != null && models.size() > 0 ) ? (Book) models.get(0) : null;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void add(Book book) {
        try {
            getCurrentSession().save(book);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void update(Book book) {
        try {
            getCurrentSession().update(book);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Book findById(long id){
        try {
            Book book = (Book) getCurrentSession().get(Book.class, id);
            return  book;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void delete(Book book) {
        try {
            getCurrentSession().delete(book);
        } catch (Throwable e) {
            throw e;
        }
    }

    public void deleteAll(){
        List<Book> entityList = findAll();
        for (Book entity : entityList) {
            delete(entity);
        }
    }
}

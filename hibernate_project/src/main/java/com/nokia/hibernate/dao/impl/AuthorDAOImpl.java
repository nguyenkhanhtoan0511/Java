package com.nokia.hibernate.dao.impl;

import com.nokia.hibernate.dao.AuthorDAO;
import com.nokia.hibernate.entity.Author;

import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {

    private Session currentSession;

    public AuthorDAOImpl(){
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
    public List<Author> findAll() {
        try {
            Query query = getCurrentSession().createQuery("from Author");
            List<Author> authors = query.list();
            return authors;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Author getAuthor(String name) {
        try {
            Query query = getCurrentSession().createQuery("from Author where name = :name");
            query.setParameter("name", name);
            List<Author> models = query.list();
            return (models != null && models.size() > 0 ) ? (Author) models.get(0) : null;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void add(Author author) {
        try {
            getCurrentSession().save(author);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void update(Author author) {
        try {
            getCurrentSession().update(author);
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public Author findById(long id){
        try {
            Author author = (Author) getCurrentSession().get(Author.class, id);
            return  author;
        } catch (Throwable e) {
            throw e;
        }
    }

    @Override
    public void delete(Author author) {
        try {
            getCurrentSession().delete(author);
        } catch (Throwable e) {
            throw e;
        }
    }

    public void deleteAll(){
        List<Author> entityList = findAll();
        for (Author entity : entityList) {
            delete(entity);
        }
    }
}

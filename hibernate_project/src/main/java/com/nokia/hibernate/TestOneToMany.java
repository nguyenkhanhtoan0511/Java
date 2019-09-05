package com.nokia.hibernate;

import com.nokia.hibernate.entity.Author;
import com.nokia.hibernate.entity.Book;
import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestOneToMany {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Book book1 = new Book("hello world", "khanh toan", 2019);
        Book book2 = new Book("java", "khanh toan", 2018);

        Author author1 = new Author("khanh toan", 22);

        Set<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);

        author1.setBooks(books);

        session.save(author1);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Query q = session.createQuery("from Author where name =:name");
//        q.setParameter("name", "khanh toan");
//        List<Author> authors = q.list();
//        for(Author e:authors){
//            System.out.println(e.toString());
//            Set<Book> books = e.getBooks();
//            for(Book b:books){
//                System.out.println(b.toString());
//            }
//        }
//
//        session.close();
    }
}

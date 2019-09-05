package com.nokia.hibernate;

import com.nokia.hibernate.entity.Book;
import com.nokia.hibernate.service.BookService;
import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        BookService BookService = new BookService();
//        BookService.deleteAll();

        Book book1 = new Book("con cao va chum nho", "nk", 2012);
        Book book2 = new Book("7 chu lun", "khanh toan", 2019);
        Book book3 = new Book("loc", "quang loc", 2000);
        Book book4 = new Book("training", "do van toan", 2019);
        Book book5 = new Book("ahihi", "khanh toan", 2019);

        BookService.add(book1);
        BookService.add(book2);
        BookService.add(book3);
        BookService.add(book4);
        BookService.add(book5);

        Book BookId1 = BookService.findById(1);
        if(BookId1 != null){
            System.out.println("Book id 1: ");
            System.out.println(BookId1.toString());
        }

        Book BookId4 = BookService.findById(4);
        System.out.println(BookId4);
        if(BookId4 != null){
            BookService.delete(BookId4);
        }else{
            System.out.println("Can't find Artist for ID");
        }

        Book BookId31 = BookService.findById(31);
        if(BookId31 != null){
            BookId31.setTitle("update");
            BookId31.setAuthor("quang loc");
            BookId31.setYear(2020);
            BookService.update(BookId31);
        }
//
        System.out.println("List Books: ");
        List<Book> listBooks2 = BookService.findAll();
        for(Book e: listBooks2){
            System.out.println(e.toString());
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Book where author =:author";
        Query query = session.createQuery(hql);
        query.setParameter("author", "khanh toan");
        List<Book> results = query.list();
        for(Book e: results){
            System.out.println(e.toString());
        }

        HibernateUtil.shutdown();
    }
}

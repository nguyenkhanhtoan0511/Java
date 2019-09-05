package com.nokia.hibernate;

import com.nokia.hibernate.entity.Author;
import com.nokia.hibernate.service.AuthorService;
import com.nokia.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class TestAuthor {
    public static void main(String[] args) {
        AuthorService AuthorService = new AuthorService();
//        AuthorService.deleteAll();

//        Author author1 = new Author( "khanh toan", 22);
//        Author author2 = new Author( "quang loc", 27);
//        Author author3 = new Author( "ada", 31);
//        Author author4 = new Author( "abc", 57);
//        Author author5 = new Author( "zzzzz", 12);
//
//        AuthorService.add(author1);
//        AuthorService.add(author2);
//        AuthorService.add(author3);
//        AuthorService.add(author4);
//        AuthorService.add(author5);

        Author AuthorId4 = AuthorService.findById(4);
        System.out.println(AuthorId4);
        if(AuthorId4 != null){
            AuthorService.delete(AuthorId4);
        }else{
            System.out.println("Can't find Artist for ID");
        }

        Author authorId4 = AuthorService.findById(3);
        if(authorId4 != null){
            authorId4.setName("khanh toan");
            authorId4.setAge(12);
            AuthorService.update(authorId4);
        }

        System.out.println("List Authors: ");
        List<Author> listAuthors2 = AuthorService.findAll();
        for(Author e: listAuthors2){
            System.out.println(e.toString());
        }


//        Session session = HibernateUtil.getSessionFactory().openSession();
//        String hql = "from Author where name =:name";
//        Query query = session.createQuery(hql);
//        query.setParameter("name", "khanh toan");
//        List<Author> results = query.list();
//        for(Author e: results){
//            System.out.println(e.toString());
//        }
//
//        HibernateUtil.shutdown();
    }
}

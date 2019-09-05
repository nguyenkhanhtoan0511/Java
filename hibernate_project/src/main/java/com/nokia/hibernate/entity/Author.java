package com.nokia.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long authorID;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="author_id")
    private Set<Book> books;

    public Author(){

    }

    public Author(String name, int age){
        this.name = name;
        this.age = age;
    }

    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
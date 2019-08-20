package com.nokia.java.example;

import java.util.TreeSet;

public class Test {

    public void go() {
        Book b1 = new Book("ffadadsasdhs");
        Book b2 = new Book("bans");
        Book b3 = new Book("jahdk");
        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
    public static void main (String[] args) {
       new Test().go();
    }

}
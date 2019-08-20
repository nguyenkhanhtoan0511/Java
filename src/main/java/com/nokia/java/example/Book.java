package com.nokia.java.example;

class Book implements Comparable {
    String title;
    public Book(String t) {
        title = t;
    }
    public int compareTo(Object b){
        Book book = (Book) b;
        return (title.compareTo(book.title));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}

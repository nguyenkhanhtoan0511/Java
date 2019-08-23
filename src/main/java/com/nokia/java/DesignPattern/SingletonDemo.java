package com.nokia.java.DesignPattern;

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.showMasage();

    }

}

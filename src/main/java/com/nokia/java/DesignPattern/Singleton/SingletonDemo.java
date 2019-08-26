package com.nokia.java.DesignPattern.Singleton;

import com.nokia.java.DesignPattern.Singleton.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.showMasage();

    }

}

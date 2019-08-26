package com.nokia.java.DesignPattern.Singleton;

public class Singleton {
    private static Singleton m_designPattern;

    private Singleton(){ }

    public static Singleton getInstance(){
        if(m_designPattern == null){
            synchronized (Singleton.class){
                if(m_designPattern == null){
                    m_designPattern = new Singleton();
                }
            }
        }
        return m_designPattern;
    }

    public void showMasage(){
        System.out.println("hello World");
    }


}

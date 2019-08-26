package com.nokia.java.threads;

public class TestWithDraw {
    public static void main(String[] args) {
        WithDraw withDraw = new WithDraw();

        new Thread(){
            public void run(){
                withDraw.withDraw(15000);
            }
        }.start();

        new Thread(){
            public void run(){
                withDraw.deposit(10000);
            }
        }.start();


    }
}

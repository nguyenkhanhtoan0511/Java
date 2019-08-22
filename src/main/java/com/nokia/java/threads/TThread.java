package com.nokia.java.threads;

import java.util.Date;

public class TThread implements Runnable {

    private String m_name;

    public TThread(String name) {
        this.m_name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread " + m_name + " running at " + new Date());
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                System.out.printf("Error while running thread ", e);
            }
        }
    }
}

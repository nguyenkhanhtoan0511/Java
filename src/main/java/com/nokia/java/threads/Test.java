package com.nokia.java.threads;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        // new thread pool with size is 5
        ExecutorService executor = Executors.newFixedThreadPool(10); // allow maximum 5 worker running in same thime

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            Runnable worker = new Worker("worker_" + (i + 1));
            executor.execute(worker);//calling execute method of ExecutorService
        }

        // close
        executor.shutdown();
        while (!executor.isTerminated()) {}

        System.out.println("Executed time -> " + (System.currentTimeMillis() - startTime)/1000 + " second" );
    }

    static class Worker implements Runnable {

        private String m_name;

        public Worker(String name) {
            this.m_name = name;
        }

        @Override
        public void run() {
            System.out.println("Start " + m_name + " at -> " + new Date());
            try {
                Thread.sleep(5*1000); // every task is running in 5s
            } catch (InterruptedException e) {
                System.out.println("Error while running worker " + m_name + " at -> " + new Date());
            }
        }
    }
}
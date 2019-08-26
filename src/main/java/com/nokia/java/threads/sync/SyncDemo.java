package com.nokia.java.threads.sync;

public class SyncDemo {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadSender threadSender1 = new ThreadSender("hi", snd);
        ThreadSender threadSender2 = new ThreadSender("bye", snd);

        threadSender1.start();
        threadSender2.start();
        try{
            threadSender1.join();
            threadSender2.join();
        }catch (Exception e){
            System.out.println("thread interupt");
        }
    }
}

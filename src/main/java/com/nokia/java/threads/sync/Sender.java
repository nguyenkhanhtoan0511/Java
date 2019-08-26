package com.nokia.java.threads.sync;

public class Sender {

    public void send(String msg){
        synchronized (this){
            System.out.println("sending " + msg);

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("thread interupt");
            }

            System.out.println(msg + "Toan");
        }
    }
}

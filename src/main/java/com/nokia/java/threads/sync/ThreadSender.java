package com.nokia.java.threads.sync;

public class ThreadSender extends Thread{
    private String msg;
    private Sender sender;

    ThreadSender(String msg, Sender sender){
        this.sender = sender;
        this.msg = msg;
    }

    public void run(){
        sender.send(msg);
    }

}

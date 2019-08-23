package com.nokia.java.threads;

class CreateThread implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        CreateThread m1=new CreateThread();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}

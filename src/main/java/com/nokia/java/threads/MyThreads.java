package com.nokia.java.threads;

public class MyThreads implements Runnable {

    String name;
    Thread t;

    public MyThreads(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread: "+  t);
        t.start();
    }

    @Override
    public void run(){
        try{
            for(int i =5; i<0; i--){
                System.out.println(name+": "+ i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(name + " Interupted");
        }
        System.out.println(name+ " existing");
    }

}

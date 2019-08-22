package com.nokia.java.threads;

public class MultiThreads {

    public static void main(String args[]){

        new MyThreads("One");
        new MyThreads("Two");
        new MyThreads("Three");
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
                System.out.println("Main thread Interupted");
        }
        System.out.println("Main thread existing");
    }
}


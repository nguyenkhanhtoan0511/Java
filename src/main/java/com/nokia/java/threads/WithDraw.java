package com.nokia.java.threads;

public class WithDraw {
    int amount = 10000;

    synchronized void withDraw(int amount){
        System.out.println("Withdrawing ...");

        if(this.amount<amount){
            System.out.println("The account not enough money. ");
            try{
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        this.amount -= amount;
        System.out.println("balance: " + this.amount);
        System.out.println("complete withdrawal");
    }

    synchronized void deposit(int amount){
        System.out.println("deposit");

        this.amount += amount;

        System.out.println("complete deposit");

        notify();
    }
}

package com.nokia.java.oop;

public class Dog extends Animal {

    private String dogSound = "gaugau";

    public Dog(int age, String name, TypeSex sex){
        super(age, name, sex);
    }

    public String animalSound(){
        return dogSound;
    }


}

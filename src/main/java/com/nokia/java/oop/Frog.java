package com.nokia.java.oop;

public class Frog extends Animal {
    private String frogSound = "frog frog";
    public Frog(int age, String name, TypeSex sex){
        super(age, name, sex);
    }
    public String animalSound(){
        return frogSound;
    }
}

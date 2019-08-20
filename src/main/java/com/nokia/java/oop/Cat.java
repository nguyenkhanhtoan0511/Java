package com.nokia.java.oop;

public class Cat extends Animal {
    String catSound = "meow";
    public Cat(int age, String name, TypeSex sex){
        super(age, name, sex);
    }
    public String animalSound(){
        return catSound;
    }
}

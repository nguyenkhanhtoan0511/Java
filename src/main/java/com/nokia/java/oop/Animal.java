package com.nokia.java.oop;

import java.util.Comparator;
import java.util.List;

public abstract class Animal implements ISound, Comparable<Animal> {
    enum TypeSex{
        Male,
        Female
    }
    private int age;
    private String name;
    private TypeSex sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeSex getSex() {
        return sex;
    }

    public void setSex(TypeSex sex) {
        this.sex = sex;
    }

    public Animal(int age, String name, TypeSex sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "age = " + age + " name = " + name + " sex = " + sex + "sound = "+ animalSound();
    }

    @Override
    public int compareTo(Animal a){
        return getName().compareTo(a.getName());
    }

    @Override
    public boolean equals(Object o) {
        Animal a = (Animal) o;
        return getName().equals(a.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

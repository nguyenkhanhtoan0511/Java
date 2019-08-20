package com.nokia.java.oop;

import java.util.Comparator;
import java.util.List;

public abstract class Animal implements ISound{
    enum TypeSex{
        Male,
        Female
    }
    int age;
    String name;
    TypeSex sex;

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

    public static Comparator<Animal> SortByAge = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            int ageAnimal1 = a1.getAge();
            int ageAnimal2 = a2.getAge();
            return ageAnimal1-ageAnimal2;
        }
    };

    public static Comparator<Animal> SortByName = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            String nameAnimal1 = a1.getName();
            String nameAnimal2 = a2.getName();
            return nameAnimal1.compareTo(nameAnimal2);
        }
    };


}

package com.nokia.java.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static double averaged(List<Animal> animals){
        double result =0;
        for(Animal element:animals){
            result+= element.getAge();
        }
        result/=animals.size();
        return result;
    }

    public static  void main(String args[]){
        List<Animal> listKitten = new ArrayList<Animal>();
        listKitten.add(new Kitten(3, "b"));
        listKitten.add(new Kitten(2, "c"));
        listKitten.add(new Kitten(5, "a"));
        System.out.println("List Kitten:");
        Collections.sort(listKitten, Animal.SortByAge);
        for(Animal element: listKitten){
            System.out.println(element.toString());
        }
        System.out.println("Average age: "+ averaged(listKitten));
        List<Animal> listDog = new ArrayList<Animal>();
        listDog.add(new Dog(2, "Dog1", Animal.TypeSex.Male));
        listDog.add(new Dog(5, "Dog2", Animal.TypeSex.Female));
        listDog.add(new Dog(1, "Dog3", Animal.TypeSex.Female));
        listDog.add(new Dog(1, "Dog4", Animal.TypeSex.Male));
        Collections.sort(listDog, Animal.SortByName);
        System.out.println("List Dog:");
        for(Animal element: listDog){
            System.out.println(element.toString());
        }
        System.out.println("Average age: "+ averaged(listDog));
    }
}

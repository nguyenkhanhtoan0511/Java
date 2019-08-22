package com.nokia.java.oop;

import java.util.*;

public class Test {
    public static double averaged(List<Animal> animals){
        double result =0;
        for(Animal element:animals){
            result+= element.getAge();
        }
        result/=animals.size();
        return result;
    }

    class AgeCompare implements Comparator<Animal>{
        public int compare(Animal a, Animal b){
            return a.getAge() - b.getAge();
        }
    }

    public void go(){
        AgeCompare ageCompare = new AgeCompare();
        List<Animal> listDog = new ArrayList<Animal>();
        listDog.add(new Dog(2, "Dogtx", Animal.TypeSex.Male));
        listDog.add(new Dog(1, "Dog5", Animal.TypeSex.Female));
        listDog.add(new Dog(1, "Dog5", Animal.TypeSex.Female));
        listDog.add(new Dog(1, "Dog4", Animal.TypeSex.Male));
        Collections.sort(listDog);
        System.out.println("List Dog:");
        for(Animal element: listDog){
            System.out.println(element.toString());
        }
        System.out.println("Average age: "+ averaged(listDog));
        HashSet<Animal> hashSetAnimal = new HashSet<Animal>();
        hashSetAnimal.addAll(listDog);
        System.out.println(hashSetAnimal);

    }

    public static  void main(String args[]){
      new Test().go();
    }
}

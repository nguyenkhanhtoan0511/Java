package com.nokia.java.DAO;

import java.util.Optional;
import java.util.List;


public class TestAplication {

    private static Dao carDao;
    private static Dao boatDao;

    public static void  main(String args[]){

        carDao = new CarDao();

//        Car car1 = getCar(1);
//        System.out.println("car1: "+ car1.toString());

//        Car car2 = getCar(0);
//        System.out.println("car2: "+ car2.toString());

//        carDao.delete(car2);
        List<Car> cars = carDao.getAll();

        for(Car element:cars){
            System.out.println(element.toString());
        }

        System.out.println();
        System.out.println();


//        carDao.save(new Car(3, "yellow"));

        carDao.delete(new Car(5, "pink"));

        List<Car> cars2 = carDao.getAll();
        for(Car element:cars2){
            System.out.println(element.toString());
        }


//        boatDao = new BoatDao();
//
//        Boat boat1 = getBoat(1);
//        System.out.println("boat1"+ boat1.toString());
//
//        Boat boat2 = getBoat(2);
//        System.out.println("boat2"+ boat2.toString());
//
//        boatDao.save(new Boat("black"));
//
//        boatDao.delete(new Boat("black"));
//
//        List<Boat> boats = boatDao.getAll();
//        for(Boat element:boats){
//            System.out.println(element.toString());
//        }

    }

    private static Car getCar(long id) {
        Optional<Car> car = carDao.get(id);
        return car.orElseGet(
                () -> new Car(0, "no-color"));
//        return car;
    }

    private static Boat getBoat(long id) {
        Optional<Boat> boat = boatDao.get(id);
        return boat.orElseGet(
                () -> new Boat("no-color"));
    }


}

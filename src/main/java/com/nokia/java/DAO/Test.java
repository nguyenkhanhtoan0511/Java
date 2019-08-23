package com.nokia.java.DAO;

public class Test {
    public static void main(String[] args) {
        Dao<Car> cars = new GenericDao<>();

        cars.save(4, new Car(4, "pink"));
        cars.save(1, new Car(3, "pink"));
        cars.save(2, new Car(3, " yellow"));
        cars.update(3, new Car(2, "jklsjd"));

        cars.printAll();

        Dao<Boat> boats = new GenericDao<>();

        boats.save(4, new Boat("pink"));
        boats.save(1, new Boat("pink"));
        boats.save(2, new Boat(" yellow"));
        boats.delete(new Boat(" yellow"));
        boats.printAll();

    }

}

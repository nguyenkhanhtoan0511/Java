package com.nokia.java.DAO;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class CarDao implements Dao<Car> {

    private List<Car> cars = new ArrayList<>();

    public CarDao(){
        cars.add(new Car(4, "pink"));
        cars.add(new Car(5, "red"));
        cars.add(new Car(5, "pink"));
        cars.add(new Car(4, "red"));

    }

    public Optional<Car> get(long id){
        return Optional.ofNullable(cars.get((int) id));
    }

    public List<Car> getAll(){
        return cars;
    }

    public void save(Car car){
        cars.add(car);
    }

    public void update(Car car, String params[]){
//        car.setWheel(Objects.requireNonNull(wheel, "wheel nor null"));
//        car.setColor(Objects.requireNonNull(color, "wheel nor null"));
    }

    public void delete(Car car){
        cars.remove(car);
    }
}

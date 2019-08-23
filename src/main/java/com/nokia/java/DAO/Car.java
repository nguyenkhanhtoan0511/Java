package com.nokia.java.DAO;

import java.util.Objects;

public class Car {
    private int wheel;
    private String color;

    public Car(int wheel, String color){
        this.color = color;
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if(o==null || getClass()!=o.getClass() ) return  false;
        Car car = (Car) o;
        return Objects.equals(color, car.color)&&Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", color='" + color + '\'' +
                '}';
    }
}

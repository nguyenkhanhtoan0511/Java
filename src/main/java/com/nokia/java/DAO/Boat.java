package com.nokia.java.DAO;

import java.util.Objects;

public class Boat {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boat(String color){
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return Objects.equals(color, boat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "color='" + color + '\'' +
                '}';
    }
}

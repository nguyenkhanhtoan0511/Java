package com.nokia.java.DesignPattern.Factory.Abstract;

public class RoundedFactory extends AbstractFactory {
    public Shape getShape(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        return null;
    }
}

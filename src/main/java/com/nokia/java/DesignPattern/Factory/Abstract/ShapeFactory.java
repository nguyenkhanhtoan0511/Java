package com.nokia.java.DesignPattern.Factory.Abstract;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type){
        if(type == null)
            return null;

        if(type.equalsIgnoreCase("square")){
            return  new Square() ;
        } else if(type.equalsIgnoreCase("rectangle")){
            return  new Rectangle();
        }
        return null;
    }
}

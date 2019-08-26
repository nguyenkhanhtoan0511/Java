package com.nokia.java.DesignPattern.Factory.Abstract;

public class FactoryProducer {
    public AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedFactory();
        }else {
            return  new ShapeFactory();

        }
    }

}

package com.nokia.java.DesignPattern.Decorator;

public class RedSquareDecorator extends ShapeDecorator {

    RedSquareDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    public void draw(){
        decoratedShape.draw();
        setColor(decoratedShape);
    }

    public void setColor(Shape decoratedShape){
        System.out.println("Color red");
    }
}

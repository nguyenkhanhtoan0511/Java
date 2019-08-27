package com.nokia.java.DesignPattern.Decorator;

public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

}

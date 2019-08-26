package com.nokia.java.DesignPattern.Factory.Method;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();

        Shape shape1 = shape.shapeDraw("CIRCLE");
        shape1.draw();


        Shape shape2 = shape.shapeDraw("recTangle");
        shape2.draw();

        Shape shape3 = shape.shapeDraw("square");
        shape3.draw();




    }
}

package com.nokia.java.DesignPattern.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape m_circle = new Circle();
        m_circle.draw();

        Shape redCircle = new RedSquareDecorator(new Circle());
        redCircle.draw();

        Shape redSquare = new RedSquareDecorator(new Square());
        redSquare.draw();
    }

}

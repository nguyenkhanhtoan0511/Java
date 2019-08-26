package com.nokia.java.DesignPattern.Factory.Abstract;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryProducer().getFactory(false);

        Shape factory1 = factory.getShape("square");
        factory1.draw();

        Shape factory2 = factory.getShape("rectangle");
        factory2.draw();

        AbstractFactory factoryRounded = new FactoryProducer().getFactory(true);

        Shape factory3 = factoryRounded.getShape("square");
        factory3.draw();

        Shape factory4 = factoryRounded.getShape("rectangle");
        factory4.draw();

    }
}

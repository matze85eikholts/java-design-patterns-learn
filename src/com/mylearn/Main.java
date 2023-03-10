package com.mylearn;

import factory1.Shape;
import factory1.ShapeFactory;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello design patterns !");
        ShapeFactory factory = new ShapeFactory();
        Shape someFigure = factory.getShape("RECTANGLE");
        Shape someOtherFigure = factory.getShape("CIRCLE");
        someFigure.draw();
        someOtherFigure.draw();
    }
}

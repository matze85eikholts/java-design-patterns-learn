package com.mylearn;

import factory1.Shape;
import factory1.ShapeFactory;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello design patterns !");
        ShapeFactory rectangleFactory = new ShapeFactory();
        Shape someFigure = rectangleFactory.getShape("RECTANGLE");
        someFigure.draw();
    }
}

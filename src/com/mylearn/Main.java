package com.mylearn;

import factory2.IMiddleware;
import factory2.MiddlewareFactory;
import iterator.FruitRepository;
import iterator.Iterator;

import factory1.Shape;
import factory1.ShapeFactory;


public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello design patterns !");

        System.out.println("Iterator pattern demo: ");
        FruitRepository frutties = new FruitRepository();
        for (Iterator it = frutties.getIterator();it.hasNext();) {
            String fruit = (String) it.next();
            System.out.println("Fruit: " + fruit);
        }
        ShapeFactory factory = new ShapeFactory();
        Shape someFigure = factory.getShape("RECTANGLE");
        Shape someOtherFigure = factory.getShape("CIRCLE");
        someFigure.draw();
        someOtherFigure.draw();
        //-----------------------
        var middlewareFactory = new MiddlewareFactory();
        middlewareFactory.getMiddleware(2).doPatch();

    }
}

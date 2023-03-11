package com.mylearn;

<<<<<<< HEAD
import iterator.FruitRepository;
import iterator.Iterator;
=======
import factory1.Shape;
import factory1.ShapeFactory;
>>>>>>> factory-one

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello design patterns !");
<<<<<<< HEAD
        System.out.println("Iterator pattern demo: ");
        FruitRepository frutties = new FruitRepository();
        for (Iterator it = frutties.getIterator();it.hasNext();) {
            String fruit = (String) it.next();
            System.out.println("Fruit: "+fruit);
        }
=======
        ShapeFactory factory = new ShapeFactory();
        Shape someFigure = factory.getShape("RECTANGLE");
        Shape someOtherFigure = factory.getShape("CIRCLE");
        someFigure.draw();
        someOtherFigure.draw();
>>>>>>> factory-one
    }
}

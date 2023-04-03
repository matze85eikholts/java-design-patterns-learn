package com.mylearn;

import facade1.Facade;
import factory2.IMiddleware;
import factory2.MiddlewareFactory;
import iterator.FruitRepository;
import iterator.Iterator;

import factory1.Shape;
import factory1.ShapeFactory;
import proxy1.Image;
import proxy1.ProxyImage;
import visitor1.Computer;
import visitor1.ComputerPart;
import visitor1.DefiniteVisitor;


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
        //-------Visitor-check----
        ComputerPart computer = new Computer();
        computer.accept(new DefiniteVisitor());
        ///----------Facade----check-----
        Facade hairFacade = new Facade();
        hairFacade.makeStyledHairCut();
        /*-----Proxy-1-pattern- check -------*/
        Image image = new ProxyImage("abc.txt");
        image.display();
        System.out.println("--------After creating real image class-------");
        image.display();
    }
}

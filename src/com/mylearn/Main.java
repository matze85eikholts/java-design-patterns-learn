package com.mylearn;

import iterator.FruitRepository;
import iterator.Iterator;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello design patterns !");
        System.out.println("Iterator pattern demo: ");
        FruitRepository frutties = new FruitRepository();
        for (Iterator it = frutties.getIterator();it.hasNext();) {
            String fruit = (String) it.next();
            System.out.println("Fruit: "+fruit);
        }
    }
}

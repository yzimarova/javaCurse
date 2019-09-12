package com.playtika.javacurse.pizza;

public class FourCheesesPizzaMaker extends AbstractPizzaMaker {

    protected FourCheesesPizzaMaker() {
        super("Four cheeses");
    }

    protected void wrap() {
        System.out.println("Here's your Four cheeses pizza");
    }

    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(8000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void putIngridients() {
        System.out.println("Put all Four Cheeses' ingridients");
    }
}

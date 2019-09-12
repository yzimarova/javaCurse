package com.playtika.javacurse.pizza;

public class PoloPizzaMaker extends AbstractPizzaMaker {

    protected PoloPizzaMaker() {
        super("Polo");
    }

    protected void wrap() {
        System.out.println("Here's your Polo pizza");
    }

    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(7000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void putIngridients() {
        System.out.println("Put Polo's ingridients");
    }
}

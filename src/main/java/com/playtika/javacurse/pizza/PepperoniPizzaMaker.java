package com.playtika.javacurse.pizza;

public class PepperoniPizzaMaker extends AbstractPizzaMaker {
    public PepperoniPizzaMaker() {
        super("Pepperoni");
    }

    @Override
    protected void wrap() {
        System.out.println("Here's your Pepperoni pizza");
    }

    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(11000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void putIngridients() {
        System.out.println("Put Pepperoni's ingridients");
    }
}

package com.playtika.javacurse.pizza;

public class DneprPizzaMakerFactory implements PizzaMakerFactory{

    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case A:
                return new PoloPizzaMaker();
            case B:
                return new FourCheesesPizzaMaker();
            case C:
                return new CarbonaraPizzaMaker();
            case D:
                return new PepperoniPizzaMaker();
        }
        return null;
    }
}

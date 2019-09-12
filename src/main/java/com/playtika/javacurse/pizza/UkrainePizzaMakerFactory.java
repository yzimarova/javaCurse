package com.playtika.javacurse.pizza;

public class UkrainePizzaMakerFactory implements PizzaMakerFactory{
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case A:
                return new CarbonaraPizzaMaker();
            case B:
                return new PepperoniPizzaMaker();
            case C:
                return  new FourCheesesPizzaMaker();
            case D:
                return new PoloPizzaMaker();
        }
        return null;
    }
}

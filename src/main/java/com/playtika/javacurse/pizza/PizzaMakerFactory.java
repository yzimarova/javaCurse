package com.playtika.javacurse.pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Button button);
}

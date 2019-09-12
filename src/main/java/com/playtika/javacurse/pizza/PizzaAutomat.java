package com.playtika.javacurse.pizza;

public class PizzaAutomat {
    public static void main(String[] args) {
        UkrainePizzaMakerFactory pizzaMakerFactory = new UkrainePizzaMakerFactory();
        String pizza = pizzaMakerFactory.getPizzaMaker(Button.A)
                .makePizza();
        System.out.println(pizza);
        System.out.println("");

        DneprPizzaMakerFactory dneprPizzaMakerFactory = new DneprPizzaMakerFactory();
        pizza = dneprPizzaMakerFactory.getPizzaMaker(Button.D)
                .makePizza();
        System.out.println(pizza);
    }
}

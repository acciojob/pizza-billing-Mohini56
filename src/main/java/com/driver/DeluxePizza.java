package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(String type) {
        super(type);
        // Deluxe pizza comes with extra cheese and toppings by default
        addExtraCheese();
        addExtraToppings();
    }
}

package com.driver;

public class Main {
  public static void main(String[] args) {
      Pizza vegPizza = new Pizza("Veg");
        vegPizza.addExtraCheese();
        vegPizza.addExtraToppings();
        vegPizza.addPaperBag();

        DeluxePizza deluxePizza = new DeluxePizza("Non-veg");
        deluxePizza.addPaperBag();

        int vegPizzaBill = vegPizza.calculateBill();
        int deluxePizzaBill = deluxePizza.calculateBill();

        System.out.println("Veg Pizza Bill: " + vegPizzaBill);
        System.out.println("Deluxe Pizza Bill: " + deluxePizzaBill);

  }
}

package com.driver;

public class Pizza {

 protected String type; // "Veg" or "Non-veg"
    protected int basePrice;
    protected boolean extraCheese;
    protected boolean extraToppings;
    protected boolean paperBag;

    public Pizza(String type) {
        this.type = type;
        this.basePrice = (type.equals("Veg")) ? 300 : 400;
        this.extraCheese = false;
        this.extraToppings = false;
        this.paperBag = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void addPaperBag() {
        this.paperBag = true;
    }

    public int calculateBill() {
        int bill = basePrice;

        if (extraCheese) {
            bill += 80;
        }

        if (extraToppings) {
            bill += (type.equals("Veg")) ? 70 : 120;
        }

        if (paperBag) {
            bill += 20;
        }

        return bill;
    }
}


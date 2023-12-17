package com.driver;

public class Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean paperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        }else{
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese == true){
            return;
        }
        price = price + 80;
        bill = bill + "Extra Cheese Added: 80\n";
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings){
            return;
        }
        if(isVeg){
            price = price + 70;
            bill = bill + "Extra Toppings Added: 70\n";
        }else{
            price = price + 120;
            bill = bill + "Extra Toppings Added: 120\n";
        }
        extraToppings = true;


    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag){
            return;
        }
        price = price + 20;
        bill = bill + "Paperbag Added: 20\n";
        paperBag = true;
    }

    public String getBill(){
        // your code goes here

        bill = bill + "Total Price: " + price + "\n";
        return this.bill;
    }

    
}


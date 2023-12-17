package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int ExtraTopping;
    private int ExtraCheese;
    private int PaperBag;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.ExtraTopping=70;
            this.bill="Base price of Pizza: "+ 300+"\n";
        }
        else{
            this.price=400;
            this.ExtraTopping=120;
            this.bill="Base price of Pizza: "+ 400+"\n";
        }
        this.ExtraTopping=80;
        this.PaperBag=20;
        
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price=price+ExtraCheese;
        this.bill=this.bill+"Extra cheese Added: "+ExtraCheese+"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        price=price+ExtraToppings;
        this.bill=this.bill+"Extra cheese Added: "+ExtraToppings+"\n";
    }
    }

    public void addTakeaway(){
        // your code goes here
        price=price+PaperBag;
        this.bill=this.bill+"Paperbag Added: "+PaperBag+"\n";
    }
    }

    public String getBill(){
        // your code goes here
        this.bill=this.bill+"Total Price: "+price+"\n";
        return this.bill;
    }
    

}

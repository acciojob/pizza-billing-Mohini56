package com.driver;

public class Pizza {

    private boolean isVeg;
    private int vegPrice;
    private int nonVegPrice;
    private int ExtraCheese;
    private int ExtraTopping;
    private int totalPrice;
    private int paperBag;
    private String bill;

    Pizza(boolean isVeg){
        if(isVeg){
            this.totalPrice=300;
            this.bill="Base price of Veg Pizza: "+ 300+"\n";
        }
        else{
            this.totalPrice=400;
            this.bill="Base price of Non Veg Pizza: "+ 400+"\n";
        }
        if(isVeg){
            this.ExtraTopping=70;
        }
        else{
            this.ExtraTopping=120;
        }
        this.ExtraCheese=80;
        this.paperBag=20;
    }

    public void extraCheese(){
        totalPrice=totalPrice+ExtraCheese;
        this.bill=this.bill+"Extra cheese Added: "+ExtraCheese+"\n";
    }
    public void extraTopping(){
        totalPrice=totalPrice+ExtraTopping;
        this.bill=this.bill+"Extra Topping Added: "+ExtraTopping+"\n";
    }
    public void paperBag(){
        totalPrice=totalPrice+paperBag;
        this.bill=this.bill+"Paper Bag Added: "+paperBag+"\n";
    }
    public int getTotalP(){
        return totalPrice;
    }

    public String bill(){
        this.bill=this.bill+"The total Bill is: "+totalPrice+"\n";
        return bill;
    }



}

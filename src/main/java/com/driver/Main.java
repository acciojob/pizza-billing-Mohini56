package com.driver;

public class Main {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Would you like to eat Regular Pizza or Deluxe Pizza?");
        String ans=sc.next();


        System.out.println("Would you like to eat Veg Pizza or NonVeg Pizza?");
        Pizza r = null;
        DeluxePizza d;
        String res=sc.next();
        if(ans.equals("Regular")) {

            if (res.equals("Veg")) {
                r = new Pizza(true);
            } else {
                r = new Pizza(false);
            }


            System.out.println("Would you want Extra Cheese?");
            String res1 = sc.next();
            if (res1.equals("Yes")) {
                r.extraCheese();
            }

            System.out.println("Would you want Extra Topping?");
            String res2 = sc.next();
            if (res2.equals("Yes")) {
                r.extraTopping();
            }

            System.out.println("Would you want Paper bag?");
            String res3=sc.next();
            if(res3.equals("Yes")){
                r.paperBag();
            }

            System.out.println("Total price of the Pizza is:"+ r.getTotalP());


            System.out.println("Would you want to generate the bill?");
            String res4=sc.next();
            if(res4.equals("Yes")){
                String ans1=r.bill();
                System.out.println(ans1);
            }

        }
        else{
            if(res.equals("Veg")){
                d=new DeluxePizza(true);

            }
            else{
                d=new DeluxePizza(false);
            }
            System.out.println("Would you want Paper bag?");
            String res3=sc.next();
            if(res3.equals("Yes")){
                d.paperBag();
            }

            System.out.println("Total price of the Pizza is:"+ d.getTotalP());


            System.out.println("Would you want to generate the bill?");
            String res4=sc.next();
            if(res4.equals("Yes")){
                String ans1=d.bill();
                System.out.println(ans1);
            }
        }


  }
}

package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrize;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrize = 80;
        this.takeAwayPrice = 20;
        if(this.isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false){
            this.price += cheesePrize;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded == false){
            this.price += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeAwayAdded == false){
            this.price += takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated == false){
            if(isCheeseAdded == true){
                this.bill += "Extra Cheese Added: " + this.cheesePrize + "\n";
            }
            if(isToppingsAdded == true){
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(isTakeAwayAdded == true){
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}

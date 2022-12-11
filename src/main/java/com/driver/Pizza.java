package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrize = 80;
    private int extraToppingsVeg = 70;
    private int extraToppingsNonVeg = 120;
    private int takeAway = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrize;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        if(this.isVeg){
            this.price += extraToppingsVeg;
        }
        else{
            this.price += extraToppingsNonVeg;
        }
    }

    public void addTakeaway(){
        isOptedForTakeAway = true;
        this.price += takeAway;
    }

    public String getBill(){
        this.bill = "";
        System.out.println("Base Price Of The Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded){
            this.bill += "Extra Cheese Added: " + extraCheesePrize + "\n";
        }
        if(isExtraToppingsAdded && isVeg){
            this.bill += "Extra Toppings Added: " + extraToppingsVeg + "\n";
        }
        else if(isExtraToppingsAdded && !isVeg){
            this.bill += "Extra Toppings Added: " + extraToppingsNonVeg + "\n";
        }
        if(isOptedForTakeAway){
            this.bill += "Paperbag Added: " + takeAway + "\n";
        }
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}

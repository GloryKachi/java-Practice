package myOopDesigns;

import java.util.List;

public class BaseHamburger {
    private String burgerName;
    private String breadRollType;
    private boolean meat;
    private int lettuce;
    private int carrot;
    private int egg;
    private int price;

    private List<Price> prices;

    public BaseHamburger(String burgerName,String breadRollType,boolean meat,int price){ // price of baseHamburger is 500
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        lettuce = 10;
        carrot = 10;
        egg = 10;
    }

    public int calculateBasePrice(){
        return this.price;
    }

    public int calculateAdditionalItems(){
        System.out.println("The regular price is "+ calculateBasePrice());
        Price newPrice = new Price(price);
        prices.add(newPrice);
        return price;
    }

    public int calculateFinalPrice(){
        int basePrice = calculateBasePrice();
        int addedItems = calculateAdditionalItems();
        return basePrice + addedItems;
    }



}

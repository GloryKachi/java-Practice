package chapter3Practice;

/*3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String),
the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named
getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value.
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase
*/

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityOfLitersPurchased;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation,String petrolType,int quantityOfLitersPurchased,
                          double pricePerLiter,double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityOfLitersPurchased = quantityOfLitersPurchased;
        if (pricePerLiter > 0.0){
            this.pricePerLiter = pricePerLiter;
        }
        if (percentageDiscount > 0.0){
            this.percentageDiscount = percentageDiscount;
        }

    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }

    public String getStationLocation(){
        return stationLocation;
    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public void setQuantityOfLitersPurchased(int quantityOfLitersPurchased){
        this.quantityOfLitersPurchased = quantityOfLitersPurchased;
    }
    public int getQuantityOfLitersPurchased(){
        return quantityOfLitersPurchased;
    }
    public void setPricePerLiter(double pricePerLiter){
        if (pricePerLiter > 0.0){
            this.pricePerLiter = pricePerLiter;
        }
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        if (percentageDiscount > 0.0){
            this.percentageDiscount = percentageDiscount;
        }
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public int getPurchasedAmount(double pricePerLiter, int quantityOfLitersPurchased) {
        if (pricePerLiter > 0.0) {
            quantityOfLitersPurchased = (int) (pricePerLiter * quantityOfLitersPurchased);
        }
        return quantityOfLitersPurchased;
    }

    public double netPurchasedAmount(int quantityOfLitersPurchased, double pricePerLiter,double percentageDiscount) {
        return (quantityOfLitersPurchased * pricePerLiter) - percentageDiscount;
    }
}

package chapter3Practice;

public class MyCarShowRoom {
    private String model;
    private String year;
    private double price;

    public MyCarShowRoom(String model,String year,double price){
        this.model = model;
        this.year = year;
        if (price > 0.0){
            this.price = price;
        }
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double price){
        if (price > 0.0){
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double displayPrice(double price,double discount) {
        if (price > 0.0 && discount > 0.0){
            price = price - discount;
        }
        return price;
    }

}

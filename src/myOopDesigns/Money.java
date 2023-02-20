package myOopDesigns;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Money {
    private String price;
    private String currency;


    public Money(String price, String currency){
        this.price = price;
        this.currency = currency;
    }

    public void printPrice(Printer printer){
        printer.print(price);
        printer.print(currency);
    }
}

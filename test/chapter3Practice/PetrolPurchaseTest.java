package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quantity
(type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount
that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value.
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase*/

class PetrolPurchaseTest {
    PetrolPurchase petrolPurchase;

    @BeforeEach
    public void setUp(){
        petrolPurchase = new PetrolPurchase("Yaba","Diesel",
                5,100,10);
    }
    @Test
    public void checkThatObjectExist(){
        assertNotNull(petrolPurchase);
    }
    @Test
    public void getPurchasedAmount(){
        assertEquals(200,petrolPurchase.getPurchasedAmount(100,2));
    }
    @Test
    public void netPurchaseAmount(){
        assertEquals(490,petrolPurchase.netPurchasedAmount(5,100,10));
    }



}
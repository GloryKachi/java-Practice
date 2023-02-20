package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCarShowRoomTest {
    MyCarShowRoom myCarShowRoom;
    MyCarShowRoom myCarShowRoom2;

    @BeforeEach
    public void setUp(){
        myCarShowRoom = new MyCarShowRoom("Benz","2020",2000);
        myCarShowRoom2 = new MyCarShowRoom("Toyota Camry","2021",3000);
    }
    @Test
    public void confirmThatObjectExist(){
        assertNotNull(myCarShowRoom);
    }
    @Test
    public void displayPrice(){
        assertEquals(1800,myCarShowRoom.displayPrice(2000,200));
    }
    @Test
    public void displayPrice2(){
        assertEquals(1600,myCarShowRoom2.displayPrice(2000,400));
    }


}
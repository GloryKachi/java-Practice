package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockClassTest {
    ClockClass clockClass;
    @BeforeEach
    void setUp(){
        clockClass = new ClockClass(2,30,50);
    }
    @Test
    void checkThatObjectExist(){
        assertNotNull(clockClass);
    }
    @Test
    void displayTime(){
        assertEquals("02:04:02",clockClass.getdisplayTime(2,4,2));
    }

}
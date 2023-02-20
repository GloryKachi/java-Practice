package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateTest {
    TargetHeartRate targetHeartRate;

    @BeforeEach
    public void setUp(){
        targetHeartRate = new TargetHeartRate("Gospel Ikechukwu","Ihueze",6,22,2003);
    }
    @Test
    public void assertThatObjectExist(){
        assertNotNull(targetHeartRate);
    }
    @Test
    public void calculateAgeInYears(){
        assertEquals(19,targetHeartRate.calculateAgeInYears(22,6,2003));
    }
    @Test
    public void calculateMaximumHeartRate(){
        assertEquals(targetHeartRate.maximumHeartRate(22,6,2003),201);
    }
    @Test
    public void calculateTargetHeartRate(){
        assertEquals(151,targetHeartRate.getTargetHeartRate(22,6,2003));
    }
}


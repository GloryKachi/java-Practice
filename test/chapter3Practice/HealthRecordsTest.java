package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class HealthRecordsTest {
    HealthRecords healthRecords;
    @BeforeEach
    public void setUp() {
        healthRecords = new HealthRecords("Victoria","Lawrence","female",13,10,1999,5,14);
    }
    @Test
    public void assertThatObjectExist(){
        assertNotNull(healthRecords);
    }
    @Test
    public void ageInYears(){
        assertEquals(23,healthRecords.ageInYears(1999));
    }
    @Test
    public void maxHeartRate(){
        assertEquals(197,healthRecords.maxHeartRate(13,10,1999));
    }
    @Test
    public void targetHeartRate(){
        assertEquals(147,healthRecords.targetHeartRate(13,10,1999));
    }
    @Test
    public void calculateBmi(){
        assertEquals(393,healthRecords.bmiCalculator(14,5));
    }

}
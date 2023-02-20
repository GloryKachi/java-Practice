package chapter5Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxPlanTest {
    TaxPlan taxPlan;

    @BeforeEach
    public void setUp(){
        taxPlan = new TaxPlan();
    }
    @Test
    public void calculateCitizenTax(){
        assertEquals(3500,taxPlan.calculateHousingTaxRate(5000));
        assertEquals(6300,taxPlan.calculateFoodTaxRate(9000));
        assertEquals(63000,taxPlan.calculateClothingTaxRate(90000));
        assertEquals(7000,taxPlan.calculateTransportationTaxRate(10000));
        assertEquals(14000,taxPlan.calculateEducationTaxRate(20000));
        assertEquals(10500,taxPlan.calculateHealthCareTaxRate(15000));
        assertEquals(21000,taxPlan.calculateVacationTaxRate(30000));





    }

}
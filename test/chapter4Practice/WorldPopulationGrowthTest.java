package chapter4Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldPopulationGrowthTest {
    WorldPopulationGrowth growth;

    @BeforeEach
    public void setUp(){
        growth = new WorldPopulationGrowth();
    }
    @Test
    public void assertThatObjectExist(){
        assertNotNull(growth);
    }
    @Test
    public void confirmNewWorldPopulationGrowthRate(){
        growth.calculateNewWorldPopulationGrowthRate(0.09,8000000000L);
        assertEquals(8720000000L,growth.getWorldPopulationGrowthRate());
    }
    @Test
    public void confirmPercentageIncrease(){
        growth.setPercentageIncrease(0.09,8000000000L);
        assertEquals(720000000,growth.getPercentageIncrease());
    }

}
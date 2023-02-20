package chapter4Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {
    BinaryNumber binaryNumber;
    @BeforeEach
    public void setUp(){
        binaryNumber = new BinaryNumber();
    }
    @Test
    public void assertThatObjectExist(){
        assertNotNull(binaryNumber);
    }
    @Test
    public void convertNumberToBinary(){
        assertEquals(13, BinaryNumber.convertToDecimal(1101));
    }

}
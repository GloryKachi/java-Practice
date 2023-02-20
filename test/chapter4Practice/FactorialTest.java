package chapter4Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;
    @BeforeEach
    public void setUp(){
        Factorial factorial = new Factorial();

    }
    @Test
    public void getFactorial(){
        int factorial = Factorial.factorial(5);{
            assertEquals(120,Factorial.factorial(5));
        }

    }

}
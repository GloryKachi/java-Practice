//package chiefsClass;
//
//import chapter4Practice.TaxCalculator;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TaxCalculator2Test {
//    private TaxCalculator2 calculator;
//    private Citizen mathias;
//    private Citizen dewunmi;
//    private Citizen deola;
//    @BeforeEach
//    public void setUp(){
//        mathias = new Citizen();
//        mathias.setFirstName("Mathias");
//        mathias.setSurname("Momodu");
//        mathias.setEarnings(new BigDecimal(17000));
//
//        dewunmi = new Citizen("Adewunmi","Adegunwa");
//        dewunmi.setEarnings(BigDecimal.valueOf(25000));
//
//        deola = new Citizen("Adeola","Adekunle",BigDecimal.valueOf(40000));
//
//    }
//    @Test
//    public void calculateTax(){
//        BigDecimal mathiasTax = TaxCalculator2.calculateTax(mathias);
//        assertEquals(2550,mathiasTax.intValue());
//
//        BigDecimal wunmiTax = TaxCalculator2.calculateTax(dewunmi);
//        assertEquals(3750,wunmiTax.intValue());
//
//    }
//
//    @Test
//    public void calculateExcessTax(){
//    BigDecimal deolaTax = TaxCalculator2.calculateTax(deola);
//    assertEquals(7500,deolaTax.intValue());
//    }
//}

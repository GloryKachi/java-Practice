package chiefsClass;

import java.math.BigDecimal;

public class TaxCalculator2 {
    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private final double ADDITIONAL_TAX_RATE = 0.20;




    public static BigDecimal calculateTax(Citizen citizen) {
        BigDecimal taxAmount = BigDecimal.ZERO;


        if (citizen.getEarnings().compareTo(MINIMUM_EARNING) > 0) {
            BigDecimal minusMinimumEarnings = citizen.getEarnings().subtract(MINIMUM_EARNING);
            BigDecimal minusTwentyPercent = BigDecimal.valueOf(20 / 100).multiply(minusMinimumEarnings);
            BigDecimal minusFifteenPercent = BigDecimal.valueOf(15 / 100).multiply(MINIMUM_EARNING);
            taxAmount = minusFifteenPercent.add(minusTwentyPercent);
        }
        return taxAmount;
    }


//    public static BigDecimal calculateTax(Citizen citizen){
//        BigDecimal taxAmount = BigDecimal.ZERO;
//        if (citizen.getEarnings().compareTo(MINIMUM_EARNING) < 1){
//
//        }
//        public static BigDecimal calculateTax(Citizen citizen){
//            BigDecimal taxAmount = BigDecimal.ZERO;
//            if (citizen.getEarnings().compareTo(MINIMUM_EARNING) < 1){
//
//            }
//            }
}
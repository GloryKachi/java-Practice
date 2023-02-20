package chapter4Practice;
/*current world population 8 billion

percentage likely to increase is 0.80%

calculate world population growth for
 each year in the next 75 years.

use current growth rate as constant*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int currentYear = input.nextInt();
        int counter = 0;
        long population = 2_000_000_000;
        double percentageIncrease = 0.80;
        while (counter <= 75){
           // long estimatedGrowthRate = currentYear * percentageIncrease;
            counter++;
        }

    }

}

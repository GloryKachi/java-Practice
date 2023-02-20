package chapter7Practice;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
 //        int[] arrays = new int[10];
//        arrays = new int[]{2, 4, 6, 8, 10, 3, 14, 8, 18, 7};
//
//        for (int i = 0; i < arrays.length ; i++) {
//            for (int j = 0; j < arrays[i]; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.printf("%s%10s%n", "Face", "Frequency");

        int [] frequency = new int[7];

        SecureRandom randomNumbers = new SecureRandom();

        for (int roll = 0; roll < 50_000; roll++){
            int generatedNumber = 1 + randomNumbers.nextInt(6);
            ++frequency[generatedNumber];
        }

        for(int face = 1; face < frequency.length; face++){
            System.out.printf("%4s%10s%n", face, frequency[face]);
        }


    }
}

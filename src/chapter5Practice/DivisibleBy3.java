package chapter5Practice;

/*(Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3*/

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
       int total = 0;


        for (int counter = 0; counter <= 30 ; counter++) {
            if (counter % 3 == 0) {
                total += counter;
            }
        }
        System.out.println(total);
    }
}



package newChapter5Practice;
/*5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.*/

import java.util.Scanner;

public class NumbersDivisibleBy3 {
    public static void sumNumbersDivisibleByThree(){
        int number = 0;
        for (int counter = 0; counter < 30; counter++){
            if (counter % 3 == 0){
                number += counter;
            }
        }
        System.out.println(number);

    }

    public static void main(String[] args) {
        sumNumbersDivisibleByThree();
    }
}

package chapter5Practice;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int numCounter = 0;
        System.out.println("Enter five numbers: ");
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;

        int number;
        while (input.hasNext()) {
            number = input.nextInt();
            total += number;
            numCounter++;
        }
        System.out.printf("%d",total);


    }
}

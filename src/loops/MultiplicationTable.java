package loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number to multiply: ");
        int userInput = input.nextInt();

        System.out.println("Multiplication Table of " + userInput);
        for (int counter = 1; counter <= 10; counter++) {
            int answer = userInput * counter;

            System.out.println(userInput + " x " + counter + " = " + answer);




        }
    }
}

package loops;
/*Two numbers are entered through the keyboard.
 Write a program to find the value of one number raised to the power of another.
  (Do not use Java built-in method)*/

import java.util.Scanner;

public class SquaredValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        int square = 1;

        for (int count = 1; count <= secondNumber; count++){
            square *= firstNumber;
        }
        System.out.println(square);
    }
}

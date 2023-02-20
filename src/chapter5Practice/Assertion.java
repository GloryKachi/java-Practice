package chapter5Practice;

import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int switchValue = input.nextInt();

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3 -> System.out.println("Value is 3");
            default -> System.out.println("Value is neither 1, 2 nor 3");
        }
    }
}

package classwork;

import java.util.Scanner;

public class MinimumAndMaximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.printf("The maximum number is %d", num1);
        } else if (num2 > num1) {
            System.out.printf("The maximum number is %d", num2);
        } else if (num3 > num1) {
            System.out.printf("The maximum number is %d", num3);
        } else if (num4 > num1) {
            System.out.printf("The maximum number is %d", num4);
        } else if (num5 > num1) {
            System.out.printf("The maximum number is %d", num5);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {


        }
    }
}
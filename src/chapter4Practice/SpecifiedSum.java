package chapter4Practice;

/*4.34 (Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning. */

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int firstUserInput = input.nextInt();
        int counter = 0;
        int add = 0;

        while (counter < firstUserInput){
            System.out.println("Enter another value: ");
            int secondUserInput = input.nextInt();
            add += secondUserInput;
            if (add >= firstUserInput){
                break;
            }
            counter++;
        }
        System.out.printf("The first value you inputted is %d%nThe other values you inputted sum up the first value %d",firstUserInput,add);
    }
}

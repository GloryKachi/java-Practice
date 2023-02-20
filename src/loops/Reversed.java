package loops;

/*Question 6

Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.*/

import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int user_input = input.nextInt();
        int result = 1;

        for (int counter = 10; counter > 0; counter--){
            user_input += counter;
            System.out.println(user_input);
        }

    }
}

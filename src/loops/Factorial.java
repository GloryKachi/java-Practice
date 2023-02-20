package loops;

/*Write a program to find the factorial value of any number entered through the keyboard.*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput = input.nextInt();
        int counter = 1;
        for (int count = 1; count <= userInput; count++) {
            counter *= count;
        }
        System.out.println(counter);



    }
}

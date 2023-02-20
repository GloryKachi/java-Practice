package chapter4Practice;
/*4.30 (Right-angled Triangle) Write an application that prompts the user to enter the length of
the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
program should work for triangles of base lengths between 1 and 10. */

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the base of a triangle between 1 and 10: ");
        int userInput = scanner.nextInt();
        System.out.println("Enter length of the triangle: ");
        int userInput2 = scanner.nextInt();
        int counter = 1;
        int counter2 = 1;


        while (counter <= userInput){
            System.out.println("* ");
            counter++;
        }
        while (counter2 <= userInput2){
            System.out.print("* ");
            counter2++;
        }

    }
}

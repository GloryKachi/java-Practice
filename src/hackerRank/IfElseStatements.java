package hackerRank;

import java.util.Scanner;

/*Given an integer, n , perform the following conditional actions:

If  n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether n is weird.*/
public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            System.out.println("Weird");
        }
        if (num % 2 == 0) {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird");
            }
        }
        if (num % 2 == 0) {
            if (num >= 6 && num <= 20) {
                System.out.println("Weird");
            }
        }

        if (num % 2 == 0){
            if (num > 20){
                System.out.println("Not Weird");
            }
        }
    }
}

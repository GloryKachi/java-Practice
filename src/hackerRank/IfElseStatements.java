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
        int n = scanner.nextInt();

        boolean nIsOdd = n % 2 != 0;
        boolean nIsEven = n % 2 == 0;
        boolean nIsInRangeOf6and20 = n >= 6 && n <= 20;
        boolean nIsInRangeOf2and5 = n >=2 && n <=5;
        boolean nIsGreaterThan20 = n > 20;

        if (nIsOdd) System.out.println("Weird");
        if (nIsEven && nIsInRangeOf2and5) System.out.println("Not Weird");
        if (nIsEven && nIsInRangeOf6and20) System.out.println("Weird");
        if (nIsEven && nIsGreaterThan20) System.out.println("Not Weird");
    }

}


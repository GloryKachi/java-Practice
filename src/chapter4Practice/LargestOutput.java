package chapter4Practice;
/*4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.*/

import java.util.Scanner;

public class LargestOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;
        int secondLargest = 0;
        System.out.println("Enter 10 numbers to find the two largest numbers: ");


        while (counter < 10) {
            int numbers = input.nextInt();
            if (numbers > largest) {
                largest = numbers;
            } else if (secondLargest > largest) {


            }


            counter++;
        }
        System.out.printf("%d is the largest number%d ",largest);
    }
}



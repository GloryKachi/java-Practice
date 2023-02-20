package myOopDesigns;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];

        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.println("Enter number ");
            int userInput = input.nextInt();
            numbers[counter] = userInput;
        }
        System.out.println(Arrays.toString(numbers));


    }
}

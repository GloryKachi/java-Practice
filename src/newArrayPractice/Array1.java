package newArrayPractice;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 //       System.out.println("Please enter array size from 1  -> ");
//        int sizeOfArray = input.nextInt();
//        int[] array;
//        array = new int[sizeOfArray];

//        System.out.println("Enter an index");
//        int userInput = input.nextInt();
//        if (userInput > 5){
//            throw new IllegalArgumentException("Enter a number within the range 0 to 5");
//        }


//        System.out.println(arrayOfNumbers[userInput]);
        int []arrayOfNumbers = new int[7];


        for(int i =0; i < arrayOfNumbers.length; i++){
           arrayOfNumbers[i]  = i * 2;
        }

        for (int counter = 0; counter < arrayOfNumbers.length; counter++) {  // we used our for loop to print out the elements of our array
            System.out.print(arrayOfNumbers[counter] + " ");
        }



    }
}

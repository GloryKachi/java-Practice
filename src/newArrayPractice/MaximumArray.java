package newArrayPractice;

import java.util.Scanner;

public class MaximumArray {
   private static int [] arrayOfNumbers;
   private static int userInput;
    public static void printMyArray(){
        Scanner input = new Scanner(System.in);
         userInput = input.nextInt();
         arrayOfNumbers = new int[userInput];

        for (int counter = 0; counter < arrayOfNumbers.length; counter++){
            System.out.println("Input the elements at index " + counter);
            arrayOfNumbers[counter] = input.nextInt();
        }
    }

    public static void getMaximum(){
       int max = 0;
       for ( int number : arrayOfNumbers) {
           if (number > max) {
               max = number;
           }
       }
        System.out.println(max);

    }
    public static void getMinimum(){
        int min = userInput;
        for (int number : arrayOfNumbers){
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        System.out.println("Input number of indexes to get maximum and minimum of the values you inputted ");
        //System.out.println("Input your index");
        printMyArray();
        getMaximum();
        getMinimum();
    }
}


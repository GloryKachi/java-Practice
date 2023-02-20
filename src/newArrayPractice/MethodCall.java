package newArrayPractice;

import java.util.Scanner;

public class MethodCall {
    private static int []  myArray ;

    public static void giveArrayValues(int userInput){
        Scanner input = new Scanner(System.in);
       myArray = new int[userInput];

        for(int i =0; i < myArray.length; i++){
            System.out.println("Input the element at index " + i + " ?? -> ");
            myArray[i] = input.nextInt();
        }
    }
    public static void printArray(){
        for (int i =0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What should be the capacity of our array?? -> ");
        int userInput = input.nextInt();

        giveArrayValues(userInput);

        printArray();

    }

}


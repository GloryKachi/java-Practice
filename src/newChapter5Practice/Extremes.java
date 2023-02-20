package newChapter5Practice;
/*5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/


import java.util.Scanner;

public class Extremes {
private static int userInput;
private static int max;
private static int min;
private static final Scanner input = new Scanner(System.in);
    public static int collectMaximum() {
        int userInput,counter,max = 0;

        for (counter = 1; counter <= 5; counter++) {
            System.out.printf("Enter number %d%n", counter);
            userInput = input.nextInt();
            if (userInput > max) {
                max = userInput;
            }

        }
        System.out.println("The maximum number is "+ max);
        return max;
    }

    public static int getMinimum() {
        int min = 0;
        for (int counter = 0; counter < 5; counter++) {
             userInput = input.nextInt();
             if (counter == 0){
                 min = userInput;
             }
            if (userInput < min) {
                min = userInput;
            }
        }
        System.out.println("The minimum number is "+ min);
        return min;
    }

    public static void sumMinAndMax(){
        int sum = collectMaximum() + getMinimum();
        System.out.println("The sum of the minimum and maximum number is "+sum);
    }

    public static void main(String[] args) {
//        collectMaximum();
//        getMinimum();
        sumMinAndMax();


    }



}

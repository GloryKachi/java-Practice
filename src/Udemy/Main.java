package Udemy;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []numbers = getIntegers(5);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number "+ numbers[i] + " is at index "+ i);
        }
        System.out.println("The sum of the numbers is "+ sumUpArrays(numbers));
        System.out.println("The average of the numbers is "+ getAverage(numbers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer values\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] values){
        int sum = 0;
        double average = 0;
        for (int i = 0; i < values.length; i++) {
        sum += values[i];
        }
        average = (double) sum / values.length;
        return average;
    }

    public static int sumUpArrays(int[] arrays){
        int sum = 0;
        for (int i = 0; i <arrays.length; i++) {
            sum += arrays[i];
        }
        return sum;
    }
}

package Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] values;

    public static void main(String[] args) {
        int[] arrays = getIntegers(5);
        int[] values = printArrays(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Number at index "+ i +" is "+ arrays[i]);
        }
        System.out.println("The values in the arrays are " + Arrays.toString(values));
        System.out.println("Values in descending order "+Arrays.toString(descendingArrays(values)));
        System.out.println("The even numbers in the array are "+Arrays.toString(printEvenNumbers(values)));
        System.out.println("The odd numbers in the array are "+ Arrays.toString(printOddNumbers(values)));

    }


    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " numbers");
        values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] printArrays(int[] number) {
        for (int i = 0; i < number.length ; i++) {
            number[i] = values[i];
        }
        return number;
    }

    public static int[] descendingArrays(int[] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if (number[i] < number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
    public static int[] printEvenNumbers(int[] number) {
        int count = countEvenNumbers(number);
        int[] num = new int[count];
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = values[i];
            if ( number[i] % 2 == 0) {
                num[index] = number[i];
                index++;
            }
        }
        return num;
    }

    private static int countEvenNumbers(int[] number) {
        int count = 0;
        for (int num : number) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] printOddNumbers(int[] number){
        int count = countOddNumbers(number);
        int[] num = new int[count];
        int index = 0;
        for (int i = 0; i < number.length ; i++) {
            number[i] = values[i];
            if (number[i] % 2 == 1){
                num[index] = number[i];
                index++;
            }

        }

        return num;
    }




    private static int countOddNumbers(int[] number) {
        int count = 0;
        for (int num : number){
            if (num % 2 == 1){
                count++;
            }
        }
        return count;
    }
}


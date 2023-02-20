package Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//           arr[i]  = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//
        String[] str = new String[8];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.print(Arrays.toString(str));
//        for (String strings : str) {
//            System.out.print(Arrays.toString(str));
//        }

    }
}

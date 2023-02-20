package chapter4Practice;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number) {
        int result = -1;
        for (int i = number; i > 0 ; i--) {
            result = result * i;
        }
        return result;

    }
}

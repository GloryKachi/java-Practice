package chapter4Practice;

import java.util.Scanner;

public class PrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int password = input.nextInt();
        int length= String.valueOf(password).length();
        int counter = 1;
        int remainder;
        int total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        if (length == 4){
        while (password > 0) {
            d = password % 10 + 7;
            password = password / 10;
            c = (password % 10) + 7;
            password = password / 10;
            b = password % 10 + 7;
            password = password / 10;
            a = password % 10 + 7;

            int swap1 = a;
            a = c;
            b = swap1;

            int swap2 = b;
            b = d;
            d = swap2;



        }

        }
    }
}

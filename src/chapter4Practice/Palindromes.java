package chapter4Practice;
/*4.31 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
 For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter
a new value.*/

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five digits: ");
        int palindromes = input.nextInt();
        int palindrome = palindromes;
        int counter = 2;
        int remainder;
        int total = 0;
        while (palindrome > 0){
            remainder = palindrome % 10;
            total = (total * 10) +  remainder;
            palindrome = palindrome / 10;
            counter++;

        }
        if (total == palindromes){
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }
//



 //        int firstNumber = palindrome / 10000;
  //     int newValue1 = firstNumber % 1000;
//
//        int secondNumber = palindrome;
//        System.out.printf("%d%n%d",firstNumber,newValue1);



    }
}

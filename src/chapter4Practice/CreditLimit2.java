package chapter4Practice;

import java.util.Scanner;

public class CreditLimit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 to know your credit limit: ");
        int userInput = input.nextInt();
        int balance = 0;
        int itemsCharged = 0;
        int itemsChargedCounter = 0;
        int totalCredits;
        int totalCreditCounter = 0;

        while (userInput <= 3){
            System.out.print("Enter your account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter account balance: ");
            balance = input.nextInt();

            System.out.print("Enter total items charged: ");
            itemsCharged = input.nextInt();
            itemsChargedCounter += itemsCharged;
            itemsChargedCounter++;



            System.out.print("Enter total credits applied to your account this month: ");
            totalCredits = input.nextInt();
            totalCreditCounter += totalCredits;
            totalCreditCounter++;
            userInput++;
        }

        int newBalance = (balance + itemsChargedCounter) - totalCreditCounter;
        if (newBalance > totalCreditCounter){
            System.out.println("");
        }

    }
}

package chapter4Practice;
/*4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display the citizen’s total t*/

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times to calculate citizens tax rate: ");
        int userInput = input.nextInt();
        double firstCitizenTax = 0;
        double secondCitizenTax = 0;
        double thirdCitizenTax = 0;
        int inputCounter = 0;
        int taxRate = 30_000;
        double combinedTax = 4_500 + 0.2;

        while (inputCounter < userInput) {
            System.out.println("Enter first citizen's earnings: ");
            double firstCitizen = input.nextInt();
            firstCitizenTax += firstCitizen;

            System.out.println("Enter second citizen's earnings: ");
            double secondCitizen = input.nextInt();
            secondCitizenTax += secondCitizen;

            System.out.println("Enter third citizen's earnings: ");
            double thirdCitizen = input.nextInt();
            thirdCitizenTax += thirdCitizen;
            inputCounter++;
        }
        if (firstCitizenTax >= taxRate || secondCitizenTax >= taxRate || thirdCitizenTax >= taxRate){
            firstCitizenTax -= combinedTax;
            secondCitizenTax -= combinedTax;
            thirdCitizenTax -= combinedTax;

        } else {
            double result = firstCitizenTax * 0.2;
            firstCitizenTax -= result;

            double result2 = secondCitizenTax * 0.2;
            secondCitizenTax -= result2;

            double result3 = thirdCitizenTax * 0.2;
            thirdCitizenTax -= result3;
        }

        System.out.printf("The first citizen's total tax is %.2f%nThe second citizen's total tax is" +
                " %.2f%nThe third citizen's tax is %.2f",firstCitizenTax,secondCitizenTax,thirdCitizenTax);

    }

}

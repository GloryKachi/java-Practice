package chapter4Practice;
/*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that
 salesperson’s earnings. There’s no limit to the number of items that can be sold.*/

import java.util.Scanner;

public class SaleCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total sales for last week or 0 to quit: ");
        double sales = input.nextDouble();
        double totalSales = 0;
        while (sales != 0){
            totalSales += sales;

            sales = input.nextDouble();
        }
        double commission = (totalSales * 0.09) + 200;
        System.out.printf("Your earnings for last week is %.2f",commission);
    }

}

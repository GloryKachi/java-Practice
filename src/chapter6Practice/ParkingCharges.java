package chapter6Practice;
/*6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer. */

import java.util.Scanner;

public class ParkingCharges {


    public static int collectUserInput(){
        System.out.println("Welcome to Glow Parking Lot\rDear customer, please enter the number of hours parked ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void calculateCharges(int charges){
       charges = collectUserInput();
       double minimumFee = 2.00;
       double extraChargePerHour = 0.50;
       double twentyFourHourCharge = 10.00;
        double customerBill = 0;

           if (charges >= 3){
               customerBill = minimumFee + (extraChargePerHour * charges);
               System.out.println("Your bill is "+ customerBill);
           }

    }


    public static void main(String[] args) {
        //collectUserInput();
        calculateCharges(3);
    }
}

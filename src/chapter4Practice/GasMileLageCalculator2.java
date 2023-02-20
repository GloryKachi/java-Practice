package chapter4Practice;
/*(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user*/
import java.util.Scanner;

public class  GasMileLageCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total trips taken: ");
        int trip = input.nextInt();
        int tripCounter = 0;
        int milesCounter = 0;
        int gallonsCounter = 0;

        while (tripCounter < trip){
            System.out.print("Enter miles driven: ");
            int miles = input.nextInt();
            milesCounter += miles;
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
            gallonsCounter += gallons;
            ++tripCounter;
        }
        double average = milesCounter + gallonsCounter;
        double result = average / tripCounter;
        System.out.printf("The average for %d trips is %.2f%n",trip,average);


    }
}

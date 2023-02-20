package chapter4Practice;

import java.util.Scanner;

public class GasMileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the trip: ");
        int trip = scanner.nextInt();

        int tripCounter = 0;
        double gallonsUsed = 0;
        double milesDriven = 0;
        while(trip != -1){
            System.out.print("Enter the miles driven: ");
            double miles = scanner.nextDouble();
            milesDriven += miles;

            System.out.print("Enter the gallons used: ");
            double gallons = scanner.nextDouble();
            gallonsUsed += gallons;

            tripCounter++;

            double perTrip = miles/gallons;
            System.out.printf("The gas mileage for trip %d is: %.2f%n", trip, perTrip);

            System.out.print("Enter the number of the trip: ");
            trip = scanner.nextInt();

        }
        double average = (double) (milesDriven/gallonsUsed) / tripCounter;
        System.out.printf("The average for the total of %d trips is: %.2f", tripCounter, average);
    }
}

package saheedCode;

import java.util.Scanner;

public class WorldPopulation2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the current population: ");
            double currentPopulation = scanner.nextLong();

            System.out.print("Enter the percentage growth rate: ");
            int growthRate = scanner.nextInt();

            System.out.println("Year\tPopulation\t\tgrowth");

            double population = currentPopulation;
            int year = 1;

            while(year <= 72){
                double growthPerYear = (population * growthRate) / 100;
                population += growthPerYear;
                System.out.printf("%d\t\t%.2f\t\t%.2f%n", year, population, growthPerYear);
                double doubledGrowth = population/currentPopulation;
                if(doubledGrowth >= 2 && doubledGrowth <= 2.1)
                    System.out.println("Population has now double the current population");
                year++;
            }

        }
    }



package chapter4Practice;
/*Combine the statements that you wrote in Exercise 4.5 into a Java application that
calculates and prints the sum of the integers from 1 to 10. Use a while statement to loop through the
calculation and increment statements. The loop should terminate when the value of x becomes 11.*/

public class SumOfIntegers {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;

        while (counter < 10){
            total += counter;
            counter++;
            System.out.print(counter + " ,");
        }
    }
}

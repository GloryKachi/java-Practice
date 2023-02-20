package loops;

import java.util.Scanner;

public class MultiplyInForLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to multiply: ");
        int number = input.nextInt();
        int result = 1;
        int counter = 1;

        while (counter <= 12){
            result = number * counter;
            System.out.println(number + " x " + counter + " = " + result);
            counter++;
        }
    }
}

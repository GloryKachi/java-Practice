package loops;

import java.util.Scanner;

public class MultiplyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to multiply: ");
        int user_input = input.nextInt();

        int finalResult = 1;

        for (int count = 1; count <= 10; count++) {
            finalResult = user_input * count;
            System.out.println(user_input + " x " + count + " = " + finalResult);
        }


    }
}

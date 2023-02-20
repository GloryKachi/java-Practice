package mrFemi;

import java.util.Scanner;

public class Example2 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] numbers = {23, 15, 18, 90, 100};

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        try {
            verifyNumber(userInput);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            for (int i = 0; i < 10; i++) {
                System.out.println(".");
            }
        }

    }

    private static void verifyNumber(int userInput) throws NumberNotFoundException{
        for (int number: numbers){
            if (number == userInput){
                System.out.println("Found");
                System.exit(0);
            }
        }
        throw new NumberNotFoundException("The number you entered does not exist");
    }
}
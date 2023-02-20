package chapter4Practice;

import java.util.Scanner;
/*4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs
. For any input, if the value entered  is other than 1 or 2, keep looping until the user enters a correct value.*/

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid number");

        while (true){
           int userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2){
                System.out.println("Congratulations! the number you entered is valid");
            }


        }
    }
}

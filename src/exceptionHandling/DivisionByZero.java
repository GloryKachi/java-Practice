//package exceptionHandling;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class DivisionByZero {
//    private static Scanner keyboardInput = new Scanner(System.in);
//    public static void main(String[] args) {
//        while (true){
//            int numerator = input("Enter a numerator");
//            int denominator = input("Enter a denominator");
//            System.out.println("\n".repeat(50));
//            System.out.println("Your integer quotient is " + numerator/denominator);
//
//        }
//    }
//    private static int input(String prompt){
//        System.out.println(prompt);
//        try {
//            return keyboardInput.nextInt();
//        }
//        catch (InputMismatchException amirah){
//            System.out.println("Wrong input type");
//            input(prompt);
//        }
//    }
//}

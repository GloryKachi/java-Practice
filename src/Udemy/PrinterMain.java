package Udemy;


import java.util.Scanner;

public class PrinterMain {
    private static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static Printer printer = new Printer();

    public static void main(String[] args) {
        printMyPages();
        
    }

    public static void printMyPages() {
        System.out.println("""
                Thank you for using GK printer
                                
                press 1 to input the number of pages you want to print
                press 2 for toning
                """);
        userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                printer.printPages(userInput);
                break;
            case 2:
                System.out.println("Enter your tone level ");
                userInput = scanner.nextInt();
               int result = printer.fillUpToner("red", userInput);
                System.out.println(result);
        }
//        if (userInput > 0 && userInput <= 5){
//            printer.printPages(5);
//        }
    }
}

//    public static void colorMyPage(){
//        userInput = scanner.nextInt();
//        if (userInput == 2){
//            printer.fillUpToner("",userInput);
//        }
//    }
//}

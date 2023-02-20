package nokia;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {
        listOfMenuFunctions();
        //phoneBookMenu();
    }

    private static void listOfMenuFunctions() {
        System.out.println("""
                List of menu functions
                
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Game
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                                
                0. Exit
                """);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput){
            case 1 -> phoneBookMenu();
//            case 1 -> {
//                System.out.println("""
//                        Phone book
//
//                        1. Search
//                        2. Service Nos.
//                        3. Add name
//                        4. Erase
//                        5. Edit
//                        6. Assign tone
//                        7. Send b'card
//                        8. Options
//                        9. Speed dials
//                        10. Voice tags
//
//                        0. Exit
//                        """);
//            }
        }
    }
    private static void phoneBookMenu(){
        System.out.println("""
                Phone book
                
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials  
                10. Voice tags
                """);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        switch (userInput){
            case 1 -> {
                System.out.println("""
                        1. Search
                        
                        0. Exit
                        """);
            }
            case 2 -> {
                System.out.println("""
                        2. Service Nos
                        
                        0. Exit
                        """);
            }
            case 3 -> {
                System.out.println("""
                        3. Add name
                        
                        0. Exit
                        """);
            }
            case 4 -> {
                System.out.println("""
                        4. Erase
                        
                        0. Exit
                        """);
            }
            case 5 -> {
                System.out.println("""
                        5. Edit
                        
                        0. Exit
                        """);
            }
            case 6 -> {
                System.out.println("""
                        6. Assign tone
                        
                        0. Exit
                        """);
            }
            case 7 -> {
                System.out.println("""
                        7. Send b'card
                        
                        0. Exit
                        """);
            }
            case 8 -> {
                System.out.println("""
                        8. Options
                        
                        0. Exit
                        """);
            }
            case 9 -> {
                System.out.println("""
                        9. Speed dials
                        
                        0. Exit
                        """);
            }
            case 10 -> {
                System.out.println("""
                        10. Voice tags
                        
                        0. Exit
                        """);
            }

        }


    }

    private static void messageMenu(){

    }

}

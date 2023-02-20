package chibuzosDiary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Dairy dairy;
    private static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        createDiary();
        displayDairyMenu();
    }

    private static void createDiary() {
        Scanner keyboardInput = new Scanner(System.in);
        String mainMain = """
                Welcome to my Dairy!!!
                Let's set it up
                """;
        print(mainMain);

        String username =input("Enter your name");

        String password = input("Enter your password");

        dairy = new Dairy(username, password);
        print("Dairy created for "+ username);
        displayLockMenu();
    }

    private static void displayLockMenu(){
        String mainMain = """
                Press
                1 -> Unlock Dairy
                2 -> Lock Dairy
                3 -> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDairy();
            case 2 -> lockDairy();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication(){
        print("Thanks for using our application");
        System.exit(0);
    }
    
    private static void lockDairy() {
        dairy.lock();
        print("Locked successfully");
        displayDairyMenu();
    }

    private static void unlockDairy() {
        String password = input("Enter correct password");
        dairy.unlockWith(password);
        if (dairy.isLocked()){print("Wrong password");displayLockMenu();}
        displayDairyMenu();
    }

    private static void displayDairyMenu() {
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry by Id
                Press 3 -> Get total number of entries
                Press 4 -> Lock diary
                """;
        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDairy();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntries = dairy.numberOfEntries();
        print("You have "+totalNumberOfEntries+ "Entries");
        displayDairyMenu();
    }

    private static void findById() {
        String id = input("Enter the Id for the entry you want to find");
        Entry foundEntry = dairy.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDairyMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        dairy.write(title,body);
        print("Written successfully");
        displayDairyMenu();
    }

    private static String input(String prompt){
        //print(prompt);
        //return keyboardInput.nextLine();
        return JOptionPane.showInputDialog(null, prompt);
    }
    private static void print(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
        //System.out.println(prompt);
    }
}

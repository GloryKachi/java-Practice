package chapter5Practice;
/*5.29 (“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. */

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        System.out.println("Yay! It's Christmas season! Let's sing some carol. Press 1 to start or -1 to quit\n" +
                "Choose between 1 to 12 to get verse");
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while (userInput != -1){
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("First Day");
                    System.out.println("Enter 1 again to get verse");
                }
                case 2 -> {
                    System.out.println("Second Day");
                    System.out.println("Enter 2 again to get verse");
                }
                case 3 -> {
                    System.out.println("Third Day");
                    System.out.println("Enter 3 again to get verse");
                }
                case 4 -> {
                    System.out.println("Fourth Day");
                    System.out.println("Enter 4 again to get verse");
                }
                case 5 -> {
                    System.out.println("Fifth Day");
                    System.out.println("Enter 5 again to get verse");
                }
                case 6 -> {
                    System.out.println("Sixth Day");
                    System.out.println("Enter 6 again to get verse");
                }
                case 7 -> {
                    System.out.println("Seventh Day");
                    System.out.println("Enter 7 again to get verse");
                }
                case 8 -> {
                    System.out.println("Eight Day");
                    System.out.println("Enter 8 again to get verse");
                }
                case 9 -> {
                    System.out.println("Ninth Day");
                    System.out.println("Enter 9 again to get verse");
                }
                case 10 -> {
                    System.out.println("Tenth Day");
                    System.out.println("Enter 10 again to get verse");
                }
                case 11 -> {
                    System.out.println("Eleventh Day");
                    System.out.println("Enter 11 again to get verse");
                }
                case 12 -> {
                    System.out.println("Twelve Day");
                    System.out.println("Enter 12 again to get verse");
                }
            }

            int userInput2 = input.nextInt();
            switch (userInput2) {
                case 1 -> System.out.println("""
                        On the first day of Christmas, my true love sent to me
                        A partridge in a pear tree
                        """);
                case 2 -> System.out.println("""
                        On the second day of Christmas, my true love sent to me
                        Two turtle doves
                        """);
                case 3 -> System.out.println("""
                        On the third day of Christmas, my true love sent to me 
                        Three French hens
                        """);
                case 4 -> System.out.println("""
                        On the fourth day of Christmas, my true love sent to me
                        Four calling birds
                        """);
                case 5 -> System.out.println("""
                        On the fifth day of Christmas, my true love sent to me
                        Five golden rings
                        """);
                case 6 -> System.out.println("""
                        On the sixth day of Christmas, my true love sent to me
                        Six geese a-laying
                        """);
                case 7 -> System.out.println("""
                        On the seventh day of Christmas, my true love sent to me
                        Seven swans are swimming
                        """);
                case 8 -> System.out.println("""
                        On the eighth day of Christmas, my true love sent to me
                        Eight maids a-milking
                        """);
                case 9 -> System.out.println("""
                        On the ninth day of Christmas, my true love sent to me
                        Nine ladies
                        """);
                case 10 -> System.out.println("""
                        On the tenth day of Christmas, my true love sent to me
                        Ten lords a-leaping
                        """);
                case 11 -> System.out.println("""
                        On the eleventh day of Christmas, my true love sent to me
                        Eleven pipers piping
                        """);
                case 12 -> System.out.println("""
                        On the twelfth day of Christmas, my true love sent to me
                        Twelve drummers drumming
                        """);
            }
        }

    }

}

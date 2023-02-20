package chapter6Practice;
/*6.20 (Test for Leap Year) Write an application that prompts the user to enter an year and uses a
method called isLeapYear to check whether it is a leap year.*/

public class LeapYear {

    public static void isLeapYear(int year){
        int divideByHundred = 100;
        int divideBy4 = 4;
        int divideBy400 = 400;

        if (year % divideBy4 == 0){
            if (year % divideBy400 == 0){
                if (year % divideByHundred == 0){
                    System.out.printf("%d is a leap year",year);
                }else System.out.printf("%d is not a leap year",year);
            }else System.out.printf("%d is a leap year",year);
        }else System.out.printf("%d is not a leap year",year);
    }

    public static void main(String[] args) {
       isLeapYear(2026);
    }
}

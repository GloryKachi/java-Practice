package chapter6Practice;
/*6.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
double y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number. */


public class RoundingNumbers {
    public static void main(String[] args) {
        readDoubleValue(1239.65);
    }

    public static void readDoubleValue(double value){
        double num = Math.round(value);
        System.out.println("The value you inputted is "+ value+ " \nThe value is rounded up as "+ num);
    }
}

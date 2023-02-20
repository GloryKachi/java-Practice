package chapter6Practice;

public class CalculatingFeetAndInches {
    public static void calculateFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters;
        if (feet >= 0 || inches >= 0 && inches <= 12) {
            centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.printf("Feet + inches = %.2f",centimeters);
        }
    }

    public double calculateFeetAndInchesToCentimeters(double inches){
        calculateFeetAndInchesToCentimeters(12,2.54);

        return inches;
    }

    public static void main(String[] args) {
        calculateFeetAndInchesToCentimeters(12,2.54);
    }
}

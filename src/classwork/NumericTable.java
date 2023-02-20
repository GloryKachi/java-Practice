package classwork;

public class NumericTable {
    public static void main(String[] args) {
        for (int counter = 1; counter >= 1 ; counter--) {
            for (int count = 1; count >= counter ; count--) {
                System.out.print("1 2 3 4 5 6 7 8 9");
                System.out.println();
                System.out.println("2 3 4 5 6 7 8 9 1\n3 4 5 6 7 8 9 1 2\n4 5 6 7 8 9 1 2 3");
            }
        }
        System.out.println();
    }
}

package chapter7Practice;

public class NewArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        array = new int[]{2, 4, 6, 7, 8, 10, 12};

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i]; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

package chapter7Practice;

public class Array {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for (int counter = 0; counter < number.length ; counter++) {
            total += counter;
            System.out.println(total);
        }
        //System.out.println(total);

//        for (int counter = 0; counter < number.length; counter++){
//            number[counter] *=2;
//        }



//        System.out.printf("%s%9s%n","Index","Value");
//
//        for (int counter = 0; counter < number.length ; counter++) {
//            System.out.printf("%5d%9d%n", counter, number[counter]);
//
//        }
    }
}

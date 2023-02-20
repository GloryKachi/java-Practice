//package chiefsClass;
//
//public class Cryptographer {
//    public static String encrypt(int digits){
//        int result = 0;
//        String entry = String.valueOf(digits);
//        int firstDigit = digits / 1000;
//        int secondDigit = (digits % 1000) / 100;
//        int thirdDigit = (digits % 1000);
//        thirdDigit = (digits % 1000) / 10;
//        int fourthDigit = (digits % 1000);
//        fourthDigit = (digits % 100);
//        fourthDigit = (digits % 10);
//
//        firstDigit += 7;
//        secondDigit += 7;
//        thirdDigit += 7;
//        fourthDigit += 7;
//
//        firstDigit %= 10;
//        secondDigit %= 10;
//        thirdDigit %= 10;
//        fourthDigit %= 10;
//
//        int tempStorage = firstDigit;
//        firstDigit = thirdDigit;
//        thirdDigit = tempStorage;
//
//        tempStorage = secondDigit;
//        secondDigit = fourthDigit;
//        fourthDigit = tempStorage;
//
//
//
//        return " " + firstDigit + secondDigit + thirdDigit + fourthDigit;
//    }
//
//    public static int decrypt(int digits){
//
//        int firstDigit = digits / 1000;
//        int secondDigit = (digits % 1000) / 100;
//        int thirdDigit = (digits % 1000);
//        thirdDigit = (digits % 1000) / 10;
//        int fourthDigit = (digits % 1000);
//        fourthDigit = (digits % 100);
//        fourthDigit = (digits % 10);
//
//        firstDigit += 7;
//        secondDigit += 7;
//        thirdDigit += 7;
//        fourthDigit += 7;
//
//        firstDigit %= 10;
//        secondDigit %= 10;
//        thirdDigit %= 10;
//        fourthDigit %= 10;
//
//        int tempStorage = firstDigit;
//        firstDigit = thirdDigit;
//        thirdDigit = tempStorage;
//
//        tempStorage = secondDigit;
//        secondDigit = fourthDigit;
//        fourthDigit = tempStorage;
//
//        firstDigit = firstDigit + 10;
//        if (firstDigit + 10 < 16)
//            firstDigit += 10;
//        secondDigit %= 10;
//        thirdDigit %= 10;
//    }
//}

package chapter6Practice;

import java.security.SecureRandom;

public class DieRoll {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int face1 = 0;
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;

        for (int i = 0; i < 200; i++) {
            int face = 1 + random.nextInt(6);
            switch (face) {
                case 1 -> ++face1;
                case 2 -> ++face2;
                case 3 -> ++face3;
                case 4 -> ++face4;
                case 5 -> ++face5;
                case 6 -> ++face6;
            }
        }
        System.out.print("Face\tFrequency\n");
        System.out.printf("1\t%6d%n2\t%6d%n3\t%6d%n4\t%6d%n5\t%6d%n6\t%6d",face1,face2,face3,face4,face5,face6);
    }
}

package chapter4Practice;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {

        int counter = 0;
        int multiply = 1;
        //int multiply2 = 1;
        System.out.printf("%s%8s%8s%8s","N","N2","N3","N4");
        System.out.println();

        while (counter < 4){
            multiply *= 1;
            //multiply2 *= 2;
            counter++;

            System.out.printf("%d       ",multiply);
            //System.out.println();
            //System.out.printf("%d       ",multiply2);


        }
        System.out.println();

        }

    }


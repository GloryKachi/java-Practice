package turtleGraphics;

import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
        int [][] asterisks = new int[6][6];
        assertArray(asterisks);

    }

    public static void assertArray(int[][] asteriskCheck){
        for (int i = 0; i < asteriskCheck.length ; i++) {
            for (int j = 0; j < asteriskCheck[i].length; j++) {
                //asteriskCheck[i][j] = j;
                if (j % 3 == 0 || i % 3 == 0){
                    asteriskCheck[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(asteriskCheck[i]));
        }
    }
}

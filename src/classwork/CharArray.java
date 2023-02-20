package classwork;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[][] values = {{'x','o','x',},{'x','o','x'},{'x','x','o'}};
        //System.out.println(Arrays.deepToString(values));

        //for (char[]item : values){
            //System.out.println(" " + Arrays.deepToString(values));
        //}
        for (int counter = 0; counter < values.length; counter++) {
            for (char[] value : values) {
                System.out.print(value[counter] + " ");
            }
            System.out.println();
        }

    }
}

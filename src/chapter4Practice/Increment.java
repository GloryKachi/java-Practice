package chapter4Practice;
/*4.4 Write Java statements to accomplish each of the following tasks:
a) Use one statement to assign the sum of x and y to z, then increment x by 1.
b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
c) Use one statement to decrement the variable x by 1, then subtract it from variable total
and store the result in variable total.
d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
this statement in two different ways*/

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int x = input.nextInt();
//        System.out.print("Enter second number: ");
//        int y = input.nextInt();
//        int z = x + y;
//        for (int counter = x; counter <=x; counter++ );
//        System.out.printf("The sum of both %d",z);
        int x = 1,
            y = 2,
            z = 0;

        while(x <= 10){
            z = x + y;
            x++;
            System.out.println(z);
        }
    }
}

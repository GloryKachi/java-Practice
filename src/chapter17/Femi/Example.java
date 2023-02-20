package chapter17.Femi;

import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        Consumer<Integer> consumer =
                (Integer number)-> System.out.println(number);
    }
}

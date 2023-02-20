package chapter16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.add("Abia");
        states.add("Bauchi");
        states.add("Zamfara");
        states.add("Borno");
        System.out.println("States:: "+states);

        //Set<String> thestates = new TreeSet<>(Comparator.reverseOrder());
        Set<String> thestates = new TreeSet<>();
        thestates.add("Abia");
        thestates.add("Bauchi");
        thestates.add("Zamfara");
        thestates.add("Borno");
        System.out.println("States:: "+thestates);
    }
}

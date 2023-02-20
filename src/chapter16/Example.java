package chapter16;

import java.util.*;

public class Example {
    public static void main(String[] args) {
//        List<String> words = new ArrayList<>();
//        words.add("Semicolon");
//        words.add("Batified");
//        words.add("Obidients");
//        words.add("Atikulate");
//
//        System.out.println(words);
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

//      Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        int minimum = Collections.min(numbers);
//        System.out.println("smallest:: " + minimum);

        Collection<Integer> numberTwo = new ArrayList<>();
        numberTwo.add(1);
        numberTwo.add(2);
        numberTwo.add(3);

        System.out.println("elements in list numbers:: "+numbers);
        System.out.println("elements in list number two:: "+numberTwo);
        System.out.println("adding elements in number two to numbers");
        numbers.addAll(numberTwo);
        numbers.clear();

        System.out.println("elements in list numbers:: "+numbers);

        Iterator<Integer> numberIterator = numbers.iterator();

        while (numberIterator.hasNext()){
            System.out.println(numberIterator.next());
        }

        List<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);

        System.out.println(numbers.containsAll(list));


    }
}

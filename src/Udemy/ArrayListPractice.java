package Udemy;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList fruit = new ArrayList();
//
//        fruit.add("Mango");
//        fruit.add("Apples");
//        fruit.add("Pawpaw");
//        fruit.remove("Mango");
//        System.out.println(fruit.contains("Apples"));

        ArrayList<String> names = new ArrayList<>();

        names.add("Glory");
        names.add("Kachi");
        names.add("Saheed");
        names.add("Wunmi");

        names.remove("Kachi");
        names.add("Martha");
//        System.out.println(names.contains("Wunmi"));
        names.clear();
        System.out.println(names);

    }
}

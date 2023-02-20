package chapter14;

public class Name {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String anotherName2 = new String("John");

        System.out.println(name == anotherName2);
    }
}

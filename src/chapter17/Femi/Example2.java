package chapter17.Femi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Function<Integer, Person> function =
                (age)->new Person("Amirah", age, Gender.NON_BINARY);

        Integer[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.stream(numbers)
                .map(function)
                .collect(Collectors.toList()));

    }

    private static Person buildPerson(int age) {
        Person person = new Person("Amirah", age, Gender.FEMALE);
        return person;
    }
}

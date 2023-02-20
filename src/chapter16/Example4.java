package chapter16;

import inheritancePractice.Animal;

import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {
        Optional<Animal> foundAnimal = getAnimal();
        Animal animal = foundAnimal
                .orElseThrow(() -> new RuntimeException("Animal not found"));
        animal.speak();
    }

    private static Optional<Animal> getAnimal() {
        Animal animal = new Animal();
        return Optional.empty();
    }
}

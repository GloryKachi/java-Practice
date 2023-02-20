package inheritancePractice;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal(1,1,"White","Animal",1);
    Dog dog = new Dog("Brown","Brownie",1,2,"German Shepherd",2);
    Fish fish = new Fish("Blue","Tilapia",1,2,2,2);

    dog.eat();
    dog.move(4);
    fish.swim(5);
    fish.breath();

    }
}

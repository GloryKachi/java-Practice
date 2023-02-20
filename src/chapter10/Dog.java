package chapter10;

public class Dog extends Animal implements Movable{
    @Override
    public void speak(){
        System.out.println("Bark");
    }
    public void eat(){
        System.out.println("Eat Bone");
    }
    public void move(){
        System.out.println("Dog walk");
    }
}

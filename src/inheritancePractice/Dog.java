package inheritancePractice;

public class Dog extends Animal {
    private int legs;
    private String breed;
    private int eyes;

    public Dog(String skinColour, String name, int weight,int legs,String breed,int eyes) {
        super(1, 1, skinColour, name, weight);
        this.legs = legs;
        this.breed = breed;
        this.eyes = eyes;
    }

    private void chew(){
        System.out.println("Dogs chew bones");
    }
    private void walk(int speed){
        System.out.println("Dogs walk on two legs with an average speed of "+speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("I move like a dog");
        walk(speed);
        super.move(speed);
    }

    @Override
    public void eat(){
        System.out.println("I love eating bones");
        chew();
        super.eat();
    }

    @Override
    public void breath() {
        System.out.println("I breath with my nose");
        super.breath();
    }
}

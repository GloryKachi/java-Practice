package inheritancePractice;

public class Fish extends Animal{
    private int fins;
    private int gills;
    private int eyes;

    public Fish(String skinColour, String name, int weight,int fins, int gills,int eyes) {
        super(1, 1, skinColour, name, weight);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    private void rest(int eyes){
        System.out.println("I sleep with my "+eyes);
    }

//    @Override
//    public void move(int speed) {
//        System.out.println("I move with my fins");
//        super.move(speed);
//    }
public void swim(int speed){
        System.out.println("I swim like a fish should swim");
        super.move(speed);
}
    @Override
    public void eat() {
        System.out.println("I eat in water");
        super.eat();
    }

    @Override
    public void breath() {
        System.out.println("I breath in water");
        super.breath();
    }
}

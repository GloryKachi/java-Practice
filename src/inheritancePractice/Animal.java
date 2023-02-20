package inheritancePractice;

public class Animal {
    private int body;
    private int size;
    private String skinColour;
    private String name;
    private int weight;

    public Animal() {

    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getSkinColour() {
        return skinColour;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(int body, int size, String skinColour, String name, int weight) {
        this.body = body;
        this.size = size;
        this.skinColour = skinColour;
        this.name = name;
        this.weight = weight;
    }

    public void move(int speed) {
        System.out.println("Animals move with " + speed + " as a minimum speed");
    }

    public void eat() {
        System.out.println("Animals are meant to eat");

    }
    public void breath(){
        System.out.println("All animals breath");
    }

    public void speak() {
    }
}

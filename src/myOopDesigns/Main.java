package myOopDesigns;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car",8);

        car.startEngine(true);
        car.turnOffEngine("Off");
        car.accelerate(true);
        car.startEngine(true);
        car.brakeVehicle(true);

        ToyotaCamry toyotaCamry = new ToyotaCamry("Black");

        toyotaCamry.startEngine(true);
    }

}

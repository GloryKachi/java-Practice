package myOopDesigns;

public class ToyotaCamry extends Car{
    private String color;

    public ToyotaCamry(String color) {
        super("Toyota Camry", 2);
        this.color = color;
    }

    @Override
    public void startEngine(boolean start) {
        super.startEngine(start);
        System.out.println("Toyota Camry's engine is activated");
    }


    @Override
    public void turnOffEngine(String off) {
        super.turnOffEngine(off);
        System.out.println("Camry has been turned off");
    }

    @Override
    public void accelerate(boolean speed) {
        super.accelerate(speed);
    }

    @Override
    public void brakeVehicle(boolean stepOn) {
        super.brakeVehicle(stepOn);
    }
}

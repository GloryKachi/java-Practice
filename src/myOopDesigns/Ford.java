package myOopDesigns;

public class Ford extends Car{
    public Ford(String brandName, int cylinders) {
        super(brandName, cylinders);
    }

    @Override
    public void startEngine(boolean start) {
        super.startEngine(start);
    }
    
    @Override
    public void turnOffEngine(String off) {
        super.turnOffEngine(off);
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

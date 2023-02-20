package myOopDesigns;

public class Car {
    private String brandName;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;
    private boolean isOn = true;


    public Car(String brandName,int cylinders){
        this.brandName = brandName;
        this.cylinders = cylinders;
        //engine = true;
        //wheels = 4;
        //isOn = true;
        //increaseSpeed = true;
    }

    public String getBrandName() {
        return brandName;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(boolean start){
        if (start){turnOn();
            System.out.println("Vehicle has been turned on");}
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOffEngine(String off){
       if (off.equals("off")) isOn = false;
       System.out.println("Vehicle has been turned off");
    }

    public void accelerate(boolean speed){
        turnOn();
        boolean increaseSpeed = true;
        if (speed == increaseSpeed) System.out.println("Your speed has increased");
        else System.out.println("Speed has been reduced");
    }

    public void brakeVehicle(boolean stepOn){
        turnOn();
        if (stepOn){
            //boolean brake = true;
            System.out.println("You just stepped on the brakes");}
    }
}



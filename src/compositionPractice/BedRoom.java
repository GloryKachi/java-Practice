package compositionPractice;

public class BedRoom {
    private Fan fan;
    private Furniture furniture;
    private int size;


    public BedRoom(Fan fan, Furniture furniture, int size){
        this.fan = fan;
        this.furniture = furniture;
        this.size = size;
    }

    public void lockDoor(){
        boolean lockEntrance = true;
        if (!lockEntrance){
            unlockDoorWhenLocked();
        }else System.out.println("Door is locked");
    }

    public void turnOnFan(){
        boolean isOn = true;
        System.out.println("Fan is on");
    }

    public void turnOffFan(){
        boolean isOff = true;
        if (!isOff){
            turnOnFan();
        } else System.out.println("Fan is off");
    }

    public void unlockDoorWhenLocked(){
        boolean unlockDoor = true;
        if (!unlockDoor){
            lockDoor();
        } else System.out.println("Door is opened");
    }

    public Fan getFan() {
        return fan;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int getSize() {
        return size;
    }
}

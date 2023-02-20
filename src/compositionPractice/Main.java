package compositionPractice;

public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture("Door","Brown");
        Fan fan = new Fan(3,"Black",12,"Philips 232");
        BedRoom bedRoom = new BedRoom(fan,furniture,12);

        bedRoom.unlockDoorWhenLocked();
        bedRoom.lockDoor();
        bedRoom.turnOnFan();
        bedRoom.turnOffFan();

    }
}

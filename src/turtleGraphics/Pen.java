package turtleGraphics;

public class Pen {
    private boolean isPenUp;
    public boolean isPenUp(){
        return isPenUp;
    }
    public void penUp(){
        isPenUp = true;
    }


    public void penDown() {
        isPenUp = false;
    }
}

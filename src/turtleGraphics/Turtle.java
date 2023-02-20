package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(){
        pen = new Pen();
        currentDirection = EAST;
        currentPosition = new Position(0,0);

    }

    public void penUp() {
        pen.penUp();

    }
    public boolean isPenUp() {
        return pen.isPenUp();
    }
    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }
    private void face(Direction direction){
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    public void move(int numberOfSpecifiedSteps){
        switch (currentDirection){
            case EAST -> {
                currentPosition.setColumn(currentPosition.getColumns() + numberOfSpecifiedSteps);
            }
            case SOUTH -> {
                currentPosition.setRow(currentPosition.getRow() + numberOfSpecifiedSteps);
            }
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}

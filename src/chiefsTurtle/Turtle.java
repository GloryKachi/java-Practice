package chiefsTurtle;

import chiefsTurtle.enums.Cardinal;
import chiefsTurtle.enums.PenPosition;

public class Turtle {
    private int xCoordinate;
    private int yCoordinate;
    private Cardinal direction = Cardinal.EAST;
    private Pen pen;

    public Turtle(){}
    public Turtle(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    public Turtle(int x, int y, Cardinal direction){
        this(x,y);
        this.direction = direction;
    }


    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public Pen getPen() {
        return pen;
    }
}

package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {

    @BeforeEach
    public void setUp(){
        Turtle ijapa = new Turtle();
    }

    @Test
    public void turtleExistTest(){
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        Turtle ijapa = new Turtle();
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }
    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        assertEquals(EAST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(0,5),ijapa.getCurrentPosition());
    }


}

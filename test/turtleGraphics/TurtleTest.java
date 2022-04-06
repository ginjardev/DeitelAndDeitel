package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Pen pen;
    Turtle turtle;
    @BeforeEach
    void beginAllTestWith(){
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void turtleHasAPenTest(){
        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
    }

    @Test
    void turtleCanMovePenUp(){
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    void turtleCanMovePenDown(){
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth(){
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingEastTest(){
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, 5);

        int counter = 0;
        int[][] floor = sketchPad.getFloor();
        while(counter < numberOfSteps){
            assertEquals(1, sketchPad.getFloor()[0][counter]);
            counter++;
        }

        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }
}

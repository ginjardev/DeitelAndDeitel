package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection = EAST;
    private Position currentPosition;


    public Turtle(Pen pen) {
        this.pen = pen;
        currentPosition = new Position(0,0);
    }

    public Pen getPen() {
        //Pen pen = new Pen();
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {

        switch (currentDirection){
            case EAST -> currentDirection = SOUTH;
            case WEST -> currentDirection = NORTH;
            case SOUTH -> currentDirection = WEST;
            case NORTH -> currentDirection = EAST;
        }

    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps - 1;
        switch (currentDirection){
            case EAST:
                currentPosition.increaseColumnPositionBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if(!isPenUp()){
            int counter = 0;
            switch (currentDirection){
                case EAST:
                    while(counter < numberOfSteps){
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition][columnPosition+counter] = 1;
                        counter++;
                    }
                    break;
            }
        }
        moveForwardBy(numberOfSteps);
    }
}

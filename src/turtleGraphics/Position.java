package turtleGraphics;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString(){
        String toString = "Position\n";
        toString += "Current Row Position: "+ rowPosition;
        toString += "\nCurrent Column Position: "+ columnPosition;
        return toString;
    }

    @Override
    public boolean equals(Object obj){
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        Position convertedPosition = (Position) obj;
        boolean columnsAreEqual = convertedPosition.columnPosition == this.columnPosition;
        boolean rowsAreEqual = convertedPosition.rowPosition == this.rowPosition;
        return columnsAreEqual && rowsAreEqual;
       /* if(convertedPosition.columnPosition == this.columnPosition
                && convertedPosition.rowPosition == this.rowPosition){
            return true;
        }
        return false;*/
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;

    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}

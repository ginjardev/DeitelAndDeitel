package ticTacToeTest;


import static ticTacToeTest.BoardState.*;

public class TicTacToe {

    BoardState board[][] = new BoardState[3][3];
    BoardState players[] = new BoardState[2];
    int counter;

   public TicTacToe() {
       counter = 0;
        System.out.println("----------------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = EMPTY;
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }

    public BoardState[][] getTicTacToeBoard() {
        return board;
    }


    public int getRowCount() {
        int count = 0;
        for( int row = 0; row < board.length; row++){
            count++;
        }
        return count;
    }

    public int getColumnCount(){
            int count = 0;
            for(int column = 0; column < board[0].length; column++){
                count++;
                System.out.println(count);
            }
        return count;
    }

    public int getPlayerNumber() {
        return players.length;
    }

    public void createPlayerX() {
       players[0] = X;
    }

    public void createPlayerO() {
       players[1] = O;
    }
    public BoardState getPlayerX(){
       return players[0];
    }
    public BoardState getPlayerO(){
        return players[1];
    }

    public void playerXCanMark(int row, int column){
        boolean isEmpty = board[row][column] == EMPTY;
        //boolean isX = board[row][column] == X;
        //boolean isO = board[row][column] == O;
        if( isEmpty){
            board[row][column] = getPlayerX();
        }
    }
    public void playerOCanMark(int row, int column){
        boolean isEmpty = board[row][column] == EMPTY;
        //boolean isX = board[row][column] == X;
        //boolean isO = board[row][column] == O;
        if(isEmpty){
            board[row][column] = getPlayerO();
        }
    }
    public void playerXCanMove(int number){
        switch (number) {
            case 1 -> playerXCanMark(0, 0);
            case 2 -> playerXCanMark(0, 1);
            case 3 -> playerXCanMark(0, 2);
            case 4 -> playerXCanMark(1,0);
            case 5 -> playerXCanMark(1,1);
            case 6 -> playerXCanMark(1,2);
            case 7 -> playerXCanMark(2,0);
            case 8 -> playerXCanMark(2,1);
            case 9 -> playerXCanMark(2,2);
        }
    }

    public void playerOCanMove(int number){
        switch (number) {
            case 1 -> playerOCanMark(0, 0);
            case 2 -> playerOCanMark(0, 1);
            case 3 -> playerOCanMark(0, 2);
            case 4 -> playerOCanMark(1,0);
            case 5 -> playerOCanMark(1,1);
            case 6 -> playerOCanMark(1,2);
            case 7 -> playerOCanMark(2,0);
            case 8 -> playerOCanMark(2,1);
            case 9 -> playerOCanMark(2,2);
        }
    }

    public boolean isBoardFull() {
       for(int row = 0; row < board.length; row++){
           for(int column = 0; column < board[row].length; column++){
               if(board[row][column] != EMPTY){
                   counter++;
                   System.out.println(counter);
                   return true;
               }
           }
       }
        return false;
    }

    public boolean diagonalWin() {

       boolean positionOne = board[0][0] == board[1][1];
       boolean positionTwo = board[1][1] == board[2][2];
       boolean positionThree = board[2][0] == board[1][1];
       boolean positionFour = board[1][1] == board[0][2];
       if(positionOne && positionTwo || positionThree && positionFour){
           return true;
       }
        return false;
    }


    public boolean rowWin() {
        boolean positionOne = board[0][0] == board[0][1];
        boolean positionTwo = board[0][1] == board[0][2];
        boolean positionThree = board[1][0] == board[1][1];
        boolean positionFour = board[1][1] == board[1][2];
        boolean positionFive = board[2][0] == board[2][1];
        boolean positionSix = board[2][1] == board[2][2];
        if((positionOne && positionTwo )|| (positionThree && positionFour) || (positionFive && positionSix)){
            return true;
        }
        return false;
    }

    public boolean columnWin() {
       boolean positionOne = board[0][0] == board[1][0];
       boolean positionTwo = board[1][0] == board[2][0];
       boolean positionThree = board[0][1] == board[1][1];
       boolean positionFour = board[1][1] == board[2][1];
       boolean positionFive = board[0][2] == board[1][2];
       boolean positionSix = board[1][2] == board[2][2];
       if ((positionOne && positionTwo) || (positionThree && positionFour) || (positionFive && positionSix)){
           return true;
       }
        return false;
    }


    public void playTicTacToe() {

    }

    public int printBoard(){
       int count = 0;
        System.out.println("----------------------");
        counter = 0;
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int column = 0; column < board[row].length; column++) {
                //board[row][column] = EMPTY;
                count++;
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
        return count;
    }


    public String playerXWinsTicTacToe(BoardState player) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if(diagonalWin() || rowWin() || columnWin())
                    return player + " is winner";
            }
        }
        return player + "is not Winner";
    }
}

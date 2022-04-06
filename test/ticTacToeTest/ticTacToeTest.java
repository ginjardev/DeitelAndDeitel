package ticTacToeTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static ticTacToeTest.BoardState.*;

public class ticTacToeTest {

    TicTacToe ticTacToe;
    @BeforeEach
    void beginTestWith(){

        ticTacToe = new TicTacToe();
    }
    @Test
    void ticTacToeCreated(){
        assertNotNull(ticTacToe);
    }

    @Test
    void ticTacToeBoardCreated(){
        assertNotNull(ticTacToe.getTicTacToeBoard());
    }

    @Test
    void ticTacToeBoardHasThreeRows(){
        assertEquals(3, ticTacToe.getRowCount());
    }

    @Test
    void ticTacToeBoardHasThreeColumns(){
        assertEquals(3, ticTacToe.getColumnCount());
    }

    @Test
    void ticTacToeBoardInitializedToEmpty(){
        assertEquals(EMPTY, ticTacToe.board[0][0]);
    }

    @Test
    void ticTacToeHasTwoPlayers(){
        ticTacToe.createPlayerX();
        ticTacToe.createPlayerO();
        assertEquals(2, ticTacToe.getPlayerNumber());
    }

    @Test
    void playerXCanMakeAMove(){
        ticTacToe.createPlayerX();
        ticTacToe.playerXCanMove(1);
        assertEquals(X, ticTacToe.board[0][0]);
        ticTacToe.playerXCanMove(5);
        assertEquals(X, ticTacToe.board[1][1]);
        ticTacToe.playerXCanMove(9);
        assertEquals(X, ticTacToe.board[2][2]);
    }

    @Test
    void playerOCanMakeAMove(){
        ticTacToe.createPlayerO();
        ticTacToe.playerOCanMove(1);
        assertEquals(O, ticTacToe.board[0][0]);
        ticTacToe.playerOCanMove(2);
        assertEquals(O, ticTacToe.board[0][1]);
        ticTacToe.playerOCanMove(9);
        assertEquals(O, ticTacToe.board[2][2]);
    }

    @Test
    void playerXAndPlayerOCannotMarkOneCell(){
        ticTacToe.createPlayerX();
        ticTacToe.createPlayerO();
        ticTacToe.playerXCanMove(1);
        ticTacToe.playerOCanMove(1);
        assertEquals(X,ticTacToe.board[0][0]);
    }
    @Test
    void playersPlayUntilBoardIsFull(){
        ticTacToe.createPlayerX();
        ticTacToe.createPlayerO();
        ticTacToe.playerOCanMove(1);
        ticTacToe.playerXCanMove(5);
        ticTacToe.playerXCanMove(3);
        ticTacToe.playerXCanMove(2);
        ticTacToe.playerXCanMove(6);
        ticTacToe.playerXCanMove(4);
        ticTacToe.playerXCanMove(7);
        //ticTacToe.playerXCanMove(8);
        //ticTacToe.playerXCanMove(9);
        ticTacToe.printBoard();
        assertTrue(ticTacToe.isBoardFull());
    }


    @Test
    void playerCanWinDiagonal(){
        //ticTacToe.createPlayerX();
        ticTacToe.playerOCanMove(7);
        ticTacToe.playerOCanMove(5);
        ticTacToe.playerOCanMove(3);
        assertTrue(ticTacToe.diagonalWin());
    }

    @Test
    void playerCanWinRow(){
        ticTacToe.playerOCanMove(7);
        ticTacToe.playerOCanMove(8);
        ticTacToe.playerOCanMove(9);
        assertTrue(ticTacToe.rowWin());
    }

    @Test
    void playerCanWinColumn(){
        ticTacToe.playerOCanMove(1);
        ticTacToe.playerOCanMove(4);
        ticTacToe.playerOCanMove(7);
        assertTrue(ticTacToe.columnWin());
    }

    @Test
    void playerXWinsGame(){
        ticTacToe.createPlayerX();
        //ticTacToe.playerOCanMove(7);
        //ticTacToe.playerOCanMove(5);
        //ticTacToe.playerOCanMove(3);
        assertEquals("X is winner", ticTacToe.playerXWinsTicTacToe(X));
    }
    @Test
    void playerCanTakeTurnsToPlay(){

        ticTacToe.playTicTacToe();
    }

    @Test
    void canPrintBoard(){
        assertEquals(9, ticTacToe.printBoard());
    }
}

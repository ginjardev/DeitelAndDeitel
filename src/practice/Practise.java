package practice;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practise {
    String board[][] = new String[3][3];
    String[] gameBoy = {"welcome", "home", "son"};

    String playerX = "x";
    String playerO = "o";
    int playCount = 0;

    public String toString(){
        return "player count is " + playCount + "\ntwo players: " + playerX + " and " + playerO;
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < board.length; row++) {
            int counter = 0;
            System.out.print("| ");
            for (int column = 0; column < board[row].length; column++) {
                 board[row][column] = "EMPTY";
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public void playerXMove( int row, int column){
        if(board[row][column] != null)
            board[row][column] = playerX;

    }

    public void playerOMove( int row, int column){
        if(board[row][column] != null)
            board[row][column] = playerO;
    }


    public void showMoveOnBoard(){
        System.out.println("-------------");
        for (int row = 0; row < board.length; row++) {
            int counter = 0;
            System.out.print("| ");
            for (int column = 0; column < board[row].length; column++) {
                //board[row][column] = "0";
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public void calculatePiSeries(){
        double pi = 0;
        System.out.printf("Term  PiValue%n");
        for(int i = 1; i <= 200000; i++){
            if(i == 1){
                pi = 4/1;
            }else if(i % 2 == 0){
                pi = pi - (double) 4 / (i + (i-1));
            }else {
                pi = pi + (double) 4 / (i + (i-1));
            }
            System.out.printf("%d%20f%n", i , pi);
        }
    }

    public void printDiamond(){
        int spaces = 20;
        int star = 1;

        int five = 5;
        int four = 4;
        for(int i = 0; i < four; i++){
            for(int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for(int a = star; a > 0; a--){
                System.out.print("* ");
            }
            System.out.println();
            spaces -=2; star +=2;
        }
        for(int i = 0; i < five; i++){
            for(int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for(int a = star; a > 0; a--){
                System.out.print("* ");
            }
            System.out.println();
            spaces +=2; star -=2;
        }
    }
    public void printNewDiamond(){
        int stars = 1;
        int spaces = 10;
        int lines = 9;
        int div = lines/2+1;

        for(int i = 1; i <= lines; i++){
            for(int s = spaces; s> 0; s--){
                System.out.print(" ");
            }
            for (int a = stars; a > 0; a--){
                System.out.print("* ");
            }
            if(i < div){
                spaces -=2; stars +=2;
                System.out.println();
            }else if(i >= div){
                spaces+=2; stars-=2;
                System.out.println();
            }
        }
    }

    public int lengthOfString(int number){
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public int integerDivision(int numberOne, int numberTwo){
        int quotient = numberOne/numberTwo;
        return quotient;
    }

    public int remainderDivision(int numberOne, int numberTwo){
        int remainderQuotient = numberOne%numberTwo;
        return remainderQuotient;
    }

    String result = " ";

    public void displayDigits(int userNumber){
        while(userNumber > 0){
        int unit = remainderDivision(userNumber,10);
        result = unit + " " + result;
        userNumber = integerDivision(userNumber,10);

        }
        System.out.println(result);
    }

    }



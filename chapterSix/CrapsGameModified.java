package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModified {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static  int bankBalance = 1000;

    public static int rollDice(){

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
    public static String chatter(){
        String chatter = "";
        if (bankBalance < 200) {
            chatter = "Oh you're going for broke, huh?";
            System.out.println(chatter);
        } else if (bankBalance > 200 && bankBalance < 1000) {
            chatter = "Aw c'mon, take a chance!";
            System.out.println(chatter);
        } else if (bankBalance > 1000) {
            chatter = "You're up big. Now's the time to cash in your chips!";
            System.out.println(chatter);
        }
        return chatter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int playerWager = 0;
        while(playerWager <= 0 || playerWager > bankBalance){
            System.out.println("Enter an amount to wager: ");
            playerWager = scanner.nextInt();
        }
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch(sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if(sumOfDice == myPoint){
                gameStatus = Status.WON;
            }else if(sumOfDice == SEVEN){
                gameStatus = Status.LOST;
            }
        }
        if(gameStatus == Status.WON){
            System.out.println("Player wins");
            bankBalance += playerWager;
        }else{
            System.out.println("Player loses");
            bankBalance -= playerWager;
            if(bankBalance == 0){
                System.out.println("Sorry, you busted!");
            }
        }
        System.out.println("Bank Balance " + bankBalance);
        chatter();
    }
}

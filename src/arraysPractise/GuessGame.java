package arraysPractise;

import java.security.SecureRandom;

public class GuessGame {
    Player playerOne;
    Player playerTwo;
    Player playerThree;

    void startGame(){
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();

        SecureRandom random = new SecureRandom();
        int guessNumber = 1 + random.nextInt(10);

        boolean playerOneCorrectGuess = false;
        boolean playerTwoCorrectGuess = false;
        boolean playerThreeCorrectGuess = false;

        int playerOneGuess;
        int playerTwoGuess;
        int playerThreeGuess;

        while(true){
            System.out.println("Number to guess is " + guessNumber);

            playerOne.guess();
            playerTwo.guess();
            playerThree.guess();

            playerOneGuess = playerOne.number;
            System.out.println("Player one guessed " + playerOneGuess);
            playerTwoGuess = playerOne.number;
            System.out.println("Player two guessed " + playerTwoGuess);
            playerThreeGuess = playerOne.number;
            System.out.println("Player three guessed " + playerThreeGuess);

            if(playerOneGuess == guessNumber){
                playerOneCorrectGuess = true;
            }
            if(playerTwoGuess == guessNumber){
                playerTwoCorrectGuess = true;
            }
            if(playerThreeGuess == guessNumber){
                playerThreeCorrectGuess = true;
            }

            if(playerOneCorrectGuess || playerTwoCorrectGuess || playerThreeCorrectGuess){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + playerOneCorrectGuess);
                System.out.println("Player two got it right? " + playerTwoCorrectGuess);
                System.out.println("Player three got it right? " + playerThreeCorrectGuess);
                System.out.println("Game over");
                break;
            }else{
                System.out.println("There is no winner");
            }
        }

    }

}

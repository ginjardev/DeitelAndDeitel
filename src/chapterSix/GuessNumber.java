package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    SecureRandom random = new SecureRandom();

    public int generateRandomNumber(){
        return  1 + random.nextInt(1000);
    }

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = guessNumber.generateRandomNumber();
        int userGuess = 0;
        while(userGuess != randomNumber){
            System.out.println("Guess a number between 1 and 1000: ");
            userGuess = scanner.nextInt();
            if(userGuess == randomNumber){
                System.out.println("Congratulations. You guessed the number!");
                System.out.println("Random Number is " + randomNumber);
            }else{
                if(userGuess > randomNumber){
                    System.out.println("Too high. Try again");
                }else{
                    System.out.println("Too low. Try again");
                }
            }
        }
    }
}

package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModified {
    SecureRandom random = new SecureRandom();

    public int generateRandomNumber(){
        return  1 + random.nextInt(1000);
    }

    public static void main(String[] args) {
        GuessNumberModified guessNumber = new GuessNumberModified();
        Scanner scan = new Scanner(System.in);
        int randomNumber = guessNumber.generateRandomNumber();
        int userGuess = 0;
        int counter = 0;
        while(userGuess != randomNumber){
            System.out.println("Guess a random number between 1 and 1000: ");
            userGuess = scan.nextInt();
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
            counter++;
        }
        if(counter < 10){
            System.out.println("Either you know the secret or you got lucky!");
        }else if(counter == 10){
            System.out.println("Aha! You know the secret!");
        }else{
            System.out.println("You should be able to do better!");
        }
    }
}

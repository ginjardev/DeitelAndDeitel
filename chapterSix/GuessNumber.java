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
        int timer = -1;
        int randomNumber;
        while(timer != 0){
            randomNumber = guessNumber.generateRandomNumber();
            System.out.println("Guess a number between 1 and 1000: ");
            int guess = scanner.nextInt();
            if(guess == randomNumber){
                System.out.println("Congratulations. You guessed the number!");
            }else if(guess != randomNumber){
                if(guess > randomNumber){
                    System.out.println("Too high. Try again");
                }else{
                    System.out.println("Too low. Try again");
                }
            }
            System.out.println("Press 1 to CONTINUE, 0 to EXIT");
            timer = scanner.nextInt();
        }
        System.out.println(guessNumber.generateRandomNumber());
    }
}

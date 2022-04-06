package practice;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        /*int i = 0;
        while (i < 100) {
            i += 2;
            System.out.println(i + " ");

        }*/
       /* for(int i = 0; i < 10;) {
            i +=2;
            System.out.print(i + " ");
            System.out.println();
        }*/
        Scanner scanner = new Scanner(System.in);


        int scissors = 0;
        int rock = 1;
        int paper = 2;

        int draw = 0;
        int computerWin = 0;
        int youWin = 0;


        int counter = 0;

        System.out.println("Welcome to Rock-Paper-Scissors");
        while(counter < 5){

            int computerOutput = (int) ((Math.random() * 3));

            System.out.println("Enter a number from 0 - 2 ");
            int userInput = scanner.nextInt();

            if(userInput == scissors && computerOutput == scissors) {
                System.out.println("You're scissors & the computer is scissors. It's a draw");
                draw++;
                //System.out.println(computerOutput);
            }
            if(userInput == scissors && computerOutput == rock) {
                System.out.println("You're scissors & the computer is rock. Computer won!");
                computerWin++;
                //System.out.println(computerOutput);
            }
            if(userInput == scissors && computerOutput == paper) {
                System.out.println("You're scissors & the computer is paper. You won!");
                youWin++;
                //System.out.println(computerOutput);
            }
            if(userInput == rock && computerOutput == rock){
                System.out.println("You're rock & the computer is rock. It's a draw");
                draw++;
                //System.out.println(computerOutput);
            }
            if(userInput == rock && computerOutput == paper) {
                System.out.println("You're rock & the computer is paper. Computer won!");
                computerWin++;
                //System.out.println(computerOutput);
            }
            if(userInput == rock && computerOutput == scissors){
                System.out.println("You're rock & the computer is scissors. You won!");
                youWin++;
                //System.out.println(computerOutput);
            }
            if(userInput == paper && computerOutput == paper){
                System.out.println("You're paper & the computer is paper. it's a draw");
                draw++;
                //System.out.println(computerOutput);
            }
            if(userInput == paper && computerOutput == scissors) {
                System.out.println("You're paper & the computer is scissors. Computer won!");
                computerWin++;
                //System.out.println(computerOutput);
            }
            if(userInput == paper && computerOutput == rock){
                System.out.println("You're paper & the computer is rock. You won!");
                youWin++;
                //System.out.println(computerOutput);
            }
            else if (userInput > 2){
                System.out.println("Choice out of range");
            }
            counter++;

            System.out.println("computer value " + computerOutput);
        }

        System.out.println("Game draws = " + draw);
        System.out.println("Computer won " + computerWin + " times");
        System.out.println("You won " + youWin + " times");

    }
}

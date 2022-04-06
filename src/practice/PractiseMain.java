package practice;

import ticTacToeTest.TicTacToe;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;


public class PractiseMain {
    public static void main(String[] args) {
        int stars = 1;
        for(int i = 0; i < 10; i++){
            for(int j = stars; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }

        System.out.println();

        int count = 10;
        for(int i = 0; i < 10; i++){
            for (int j = count; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
            count--;
        }

        System.out.println();

        int counter = 10;
        int space = 0;
        for(int i = 0; i < 10; i++){
            for (int j = space; j > 0; j--){
                System.out.print(" ");
            }
            space ++;
            for (int j = counter; j > 0; j--){
                System.out.print("*");
            }
            counter--;

            System.out.println();

        }

        System.out.println();

        int marker = 0;
        int spacer = 10;
        for(int i = 0; i < 10; i++){
            for (int j = spacer; j  >0; j--){
                System.out.print(" ");
            }
            spacer--;
            for (int j = marker; j > 0; j--){
                System.out.print("*");
            }
            marker++;

            System.out.println();

        }

        System.out.println("+++++++++++++");
        System.out.println();

        int numbers = 1;
        while (numbers <= 30){

            if(numbers == 5 || numbers == 8 || numbers == 10 || numbers == 15 || numbers == 25){
                //System.out.println("print 5 asterisks");
                for(int i = numbers; i >0; i--){
                    System.out.print("*");
                }
                System.out.println();
            }

            numbers++;
        }

        /*Scanner scanner = new Scanner(System.in);
        int timer = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        while (timer < 5){
            System.out.println("enter a value: ");
            int userInput = scanner.nextInt();
            //int inputCount = 0;
            if(timer == 0 && userInput > 1 && userInput <= 30){
                a = userInput;
                timer++;
            }else if(timer == 1 && userInput > 1 && userInput <= 30){
                b = userInput;
                timer++;
            }else if(timer == 2 && userInput > 1 && userInput <= 30){
                c = userInput;
                timer++;
            }else if (timer == 3 && userInput > 1 && userInput <= 30){
                d = userInput;
                timer++;
            }else if(timer == 4 && userInput > 1 && userInput <= 30){
                e = userInput;
                timer++;
            }else{
                System.out.println("try entering a valid input");
            }

        }
        int asterisks = 0;
        for(int k = 0; k < 5; k++){
            if(k == 0){
                asterisks = a;
            }else if(k == 1){
                asterisks = b;
            }else if(k == 2){
                asterisks = c;
            }else if(k == 3){
                asterisks = d;
            }else if(k == 4){
                asterisks = e;
            }
            for(int i = asterisks; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*System.out.println("side1\t side2\t hypotenuse");
        for (int i = 1; i <= 500; i++){
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    boolean isPythagoras = ((i*i) + (j*j) == (k*k));
                    if (isPythagoras) {
                        System.out.println(i + "\t\t" + j + "\t\t\t" + k);
                    }
                }
            }
        }*/
/*
        int limit = 200000;
        int denominator = 1;
        double piValue = 0;
        int firstPiValue = 0;
        boolean foundPiValue = false;
        for (int i = 1; i <= limit ; i++) {
            if(i % 2 == 1)
                piValue += 4.0 / denominator;
            else
                piValue -=  4.0 / denominator;

            if((int) (piValue * 100000) == 314159 && !foundPiValue){
                firstPiValue = i;
                foundPiValue = true;
            }
            System.out.println(i + "\t" + piValue);
            denominator+=2;
        }
        System.out.println(firstPiValue);*/

        Practise practise = new Practise();
        //practise.calculatePiSeries();
        //practise.printDiamond();
        //practise.printNewDiamond();

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines for Diamond: ");
        int numberOfSpaces = scanner.nextInt();
        int lines = 0;
        if(numberOfSpaces > 0 && numberOfSpaces < 20){
            if(numberOfSpaces % 2 == 1){
                lines = numberOfSpaces;
            } else{
                System.out.println("number must be odd");
            }
        }else{
            System.out.println("Input out of range! - Enter a number between 1 - 19");
        }

        int stas = 1;
        int div = lines/2+1;
        int spaces = 20;

        for(int i = 1; i <= lines; i++){
            for(int s = spaces; s> 0; s--){
                System.out.print(" ");
            }
            for (int a = stas; a > 0; a--){
                System.out.print("* ");
            }
            if(i < div){
                spaces -=2; stas +=2;
                System.out.println();
            }else if(i >= div){
                spaces+=2; stas-=2;
                System.out.println();
            }
        }*/
        System.out.println(practise.lengthOfString(34));

        practise.displayDigits(123);

    }
}
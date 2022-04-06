package practice;

import java.security.SecureRandom;
import java.util.Scanner;


public class QuestionsAndAnswers {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        String sum = "+";
        String minus = "-";
        String quotient = "/";
        String multiplication = "*";


        int counter = 1;
        int userAnswer;
        int correctAnswer = 0;
        int wrongAnswer = 0;
        System.out.println((double)10/3);
        while (counter <= 10){
            Scanner scanner = new Scanner(System.in);

            int myRandomNumberOne = 1 + randomNumber.nextInt(10);
            int myRandomNumberTwo = 1 + randomNumber.nextInt(10);

            int randomQuestion = 1 + randomNumber.nextInt(4);

            int plus = myRandomNumberOne + myRandomNumberTwo;
            int subtract = myRandomNumberOne - myRandomNumberTwo;
            int multiply = myRandomNumberOne * myRandomNumberTwo;
            double divide = (double) myRandomNumberOne / (myRandomNumberTwo);

            if(randomQuestion == 1) {
                System.out.println("Question " + counter);
                System.out.println(myRandomNumberOne + " " + sum + " " + myRandomNumberTwo);
                userAnswer = scanner.nextInt();
                if(userAnswer == plus){
                    System.out.println("correct");
                    correctAnswer++;
                }else {
                    System.out.println("wrong");
                    wrongAnswer++;
                }
            }
            if(randomQuestion == 2) {
                System.out.println("Question " + counter);
                System.out.println(myRandomNumberOne + " " + minus + " " + myRandomNumberTwo);
                userAnswer = scanner.nextInt();
                if(userAnswer == subtract){
                    System.out.println("correct");
                    correctAnswer++;
                }else {
                    System.out.println("wrong");
                    wrongAnswer++;
                }
            }
            if(randomQuestion == 3) {
                System.out.println("Question " + counter);
                System.out.println(myRandomNumberOne + " " + quotient + " " + myRandomNumberTwo);
                double userAnswer2 = scanner.nextDouble();
                if(userAnswer2 == divide){
                    System.out.println("correct");
                    correctAnswer++;
                }else {
                    System.out.println("wrong");

                    System.out.println(divide);
                    wrongAnswer++;
                }
            }
            if(randomQuestion == 4) {
                System.out.println("Question " + counter);
                System.out.println(myRandomNumberOne + " " + multiplication + " " + myRandomNumberTwo);
                userAnswer = scanner.nextInt();
                if(userAnswer == multiply){
                    System.out.println("correct");
                    correctAnswer++;
                }else {
                    System.out.println("wrong");
                    wrongAnswer++;
                }
            }

            counter++;
        }
        System.out.println("You got " + correctAnswer + " answers" + "\nyou got " + wrongAnswer + " wrong answers");










    }
}

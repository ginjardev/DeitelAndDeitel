package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficultyLevels {
    SecureRandom random = new SecureRandom();
    int firstRandomNumber;
    int secondRandomNumber;
    int answer;
    public String generateEasyQuestions(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
        return "How much is " + firstRandomNumber + " times " + secondRandomNumber + "?";
    }
    public String generateDifficultQuestions(){
        firstRandomNumber = 1 + random.nextInt(100);
        secondRandomNumber = 1 + random.nextInt(100);
        return "How much is " + firstRandomNumber + " times " + secondRandomNumber + "?";
    }

    public int getAnswer(){
        return firstRandomNumber * secondRandomNumber;
    }

    public void getPositiveResponse(){
        int randomResponse = random.nextInt(4);
        switch (randomResponse){
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public void getNegativeResponse(){
        int randomResponse = random.nextInt(4);
        switch (randomResponse){
            case 0:
                System.out.println("No. Please try again!");
                break;
            case 1:
                System.out.println("Wrong. Try once more!");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying!");
                break;
        }
    }

    public static void main(String[] args) {
        CAIDifficultyLevels difficultyLevels = new CAIDifficultyLevels();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a difficulty level: 1 for EASY 2 for DIFFICULT");
        int choice = scanner.nextInt();
        int countCorrectAnswers = 0;
        int countWrongAnswers = 0;
        int userAnswer = 0;
        int i;
        if(choice == 1){
            for ( i = 0; i < 10; i++) {
                String question = difficultyLevels.generateEasyQuestions();
                int answer = difficultyLevels.getAnswer();
                //while(userAnswer != answer){
                    System.out.println(question);
                    System.out.print("Answer: ");
                    userAnswer = scanner.nextInt();
                    if(userAnswer == answer){
                        difficultyLevels.getPositiveResponse();
                    }else{
                        difficultyLevels.getNegativeResponse();
                    }
                //}
            }
        }else{
            for (i = 0; i < 10; i++) {
                String question = difficultyLevels.generateDifficultQuestions();
                int answer = difficultyLevels.getAnswer();
                    System.out.println(question);
                    System.out.print("Answer: ");
                    userAnswer = scanner.nextInt();
                    if(userAnswer == answer){
                        countCorrectAnswers++;
                        difficultyLevels.getPositiveResponse();
                    }else{
                        countWrongAnswers++;
                        difficultyLevels.getNegativeResponse();
                    }
            }
        }
        System.out.println("You got " + countCorrectAnswers + " answers correct");
        System.out.println("You got " + countWrongAnswers + " answers wrong");
        int passPercentage = ((countCorrectAnswers/i) * 100);
        if(passPercentage >= 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }else{
            System.out.println("Please ask your teacher for extra help.");
        }

    }
}

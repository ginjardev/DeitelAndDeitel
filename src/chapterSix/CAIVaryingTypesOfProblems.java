package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIVaryingTypesOfProblems {
    SecureRandom random = new SecureRandom();
    int firstRandomNumber;
    int secondRandomNumber;
    int answer;
    public String generateAdditionQuestions(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
        return "How much is " + firstRandomNumber + " plus " + secondRandomNumber + "?";
    }
    public String generateSubtractionQuestions(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
        return "How much is " + firstRandomNumber + " minus " + secondRandomNumber + "?";
    }
    public String generateMultiplicationQuestions(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
        return "How much is " + firstRandomNumber + " times " + secondRandomNumber + "?";
    }
    public String generateDivisionQuestions(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
        return "How much is " + firstRandomNumber + " divided by " + secondRandomNumber + "?";
    }

    public int getMultiplicationAnswer(){
        return firstRandomNumber * secondRandomNumber;
    }
    public int getAdditionAnswer(){
        return firstRandomNumber + secondRandomNumber;
    }
    public int getSubtractionAnswer(){
        return firstRandomNumber - secondRandomNumber;
    }
    public double getDivisionAnswer(){
        return (double) firstRandomNumber / secondRandomNumber;
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
        CAIVaryingTypesOfProblems caiVTP = new CAIVaryingTypesOfProblems();
        Scanner scanner = new Scanner(System.in);
        String prompt = """
                Press 1 for ADDITION
                Press 2 for SUBTRACTION
                Press 3 for MULTIPLICATION
                Press 4 for DIVISION
                """;
        System.out.println(prompt);
        int choice = scanner.nextInt();
        int countCorrectAnswers = 0;
        int countWrongAnswers = 0;
        int userAnswer = 0;
        int i;
        if(choice == 1){
            for ( i = 0; i < 10; i++) {
                String question = caiVTP.generateAdditionQuestions();
                int answer = caiVTP.getAdditionAnswer();
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    countCorrectAnswers++;
                    caiVTP.getPositiveResponse();
                }else{
                    countWrongAnswers++;
                    caiVTP.getNegativeResponse();
                }
            }
        }else if (choice == 2 ){
            for (i = 0; i < 10; i++) {
                String question = caiVTP.generateSubtractionQuestions();
                int answer = caiVTP.getSubtractionAnswer();
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    countCorrectAnswers++;
                    caiVTP.getPositiveResponse();
                }else{
                    countWrongAnswers++;
                    caiVTP.getNegativeResponse();
                }
            }
        }else if(choice == 3){
            for (i = 0; i < 10; i++) {
                String question = caiVTP.generateMultiplicationQuestions();
                int answer = caiVTP.getMultiplicationAnswer();
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    countCorrectAnswers++;
                    caiVTP.getPositiveResponse();
                }else{
                    countWrongAnswers++;
                    caiVTP.getNegativeResponse();
                }
            }
        }else{
            for (i = 0; i < 10; i++) {
                String question = caiVTP.generateDivisionQuestions();
                double answer = caiVTP.getDivisionAnswer();
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    countCorrectAnswers++;
                    caiVTP.getPositiveResponse();
                }else{
                    countWrongAnswers++;
                    caiVTP.getNegativeResponse();
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

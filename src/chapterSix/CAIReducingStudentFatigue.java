package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIReducingStudentFatigue {
    SecureRandom random = new SecureRandom();
    int firstRandomNumber;
    int secondRandomNumber;
    int answer;
    public String generateQuestion(){
        firstRandomNumber = 1 + random.nextInt(10);
        secondRandomNumber = 1 + random.nextInt(10);
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
        CAIReducingStudentFatigue caiReducingStudentFatigue = new CAIReducingStudentFatigue();
        Scanner scanner = new Scanner(System.in);
        int userAnswer = 0;
        for (int i = 0; i < 9; i++) {
            String question = caiReducingStudentFatigue.generateQuestion();
            int answer = caiReducingStudentFatigue.getAnswer();
            while(userAnswer != answer){
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    caiReducingStudentFatigue.getPositiveResponse();
                }else{
                    caiReducingStudentFatigue.getNegativeResponse();
                }
            }
        }

    }
}

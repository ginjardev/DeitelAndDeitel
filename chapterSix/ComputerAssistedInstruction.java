package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
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

    public static void main(String[] args) {
        ComputerAssistedInstruction cai = new ComputerAssistedInstruction();
        Scanner scanner = new Scanner(System.in);
        String question = cai.generateQuestion();
        int answer = cai.getAnswer();
        int userAnswer = 0;
        while(userAnswer != answer){
            System.out.println(question);
            System.out.print("Answer: ");
            userAnswer = scanner.nextInt();
            if(userAnswer == answer){
                System.out.println("Very good!");
            }else{
                System.out.println("No. Please try again.");
            }
        }
    }
}

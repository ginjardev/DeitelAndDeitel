package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringStudentPerformance {
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
        CAIMonitoringStudentPerformance caimsp = new CAIMonitoringStudentPerformance();
        Scanner scanner = new Scanner(System.in);

        int countCorrectAnswers = 0;
        int countWrongAnswers = 0;
        int userAnswer = 0;
        int i;
        for (i = 0; i < 10; i++) {
            String question = caimsp.generateQuestion();
            int answer = caimsp.getAnswer();
           // while(userAnswer != answer){
                System.out.println(question);
                System.out.print("Answer: ");
                userAnswer = scanner.nextInt();
                if(userAnswer == answer){
                    countCorrectAnswers++;
                    caimsp.getPositiveResponse();
                }else{
                    countWrongAnswers++;
                    caimsp.getNegativeResponse();
                }
            //}
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

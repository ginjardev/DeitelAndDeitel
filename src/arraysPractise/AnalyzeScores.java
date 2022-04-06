package arraysPractise;

import java.util.Scanner;

public class AnalyzeScores {
    public static void analyzeScores(int...scores){
        int total = 0;
        int aboveCounter = 0;
        int belowCounter = 0;
        double average = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
            average = total/ scores.length;
        }
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > average){
                aboveCounter++;
            }else if (scores[i] < average){
                belowCounter++;
            }
        }
        System.out.println("Students average = " + average);
        System.out.println(aboveCounter + " students score above average");
        System.out.println(belowCounter + " students score below average");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many scores do you want to enter? ");
        int scoresLength = scanner.nextInt();
        int[] scoresArray = new int[scoresLength];

        for (int i = 0; i < scoresArray.length; ) {
            System.out.println("Enter a student score: ");
            int checkScores = scanner.nextInt();
            if(checkScores >= 0 && checkScores < 101){
                int scores = checkScores;
                scoresArray[i] = scores;
                i++;
            }
        }
        analyzeScores(scoresArray);
    }
}

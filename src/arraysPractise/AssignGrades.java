package arraysPractise;

import java.util.Scanner;

public class AssignGrades {
    public static int findBestScore(int...scores){
        int bestScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > bestScore){
                bestScore = scores[i];
            }
        }
        return bestScore;
    }

    public static void assignGrades(int...scores){
        int maxScore = findBestScore(scores);
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= maxScore - 10){
                System.out.println("Student Grade is A");
            }else if (scores[i] >= maxScore - 20){
                System.out.println("Student Grade is B");
            }else if (scores[i] >= maxScore - 30){
                System.out.println("Student Grade is C");
            }else if (scores[i] >= maxScore - 40){
                System.out.println("Student Grade is D");
            }else{
                System.out.println("Student Grade is F");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of scores: ");
        int numberOfScores = scanner.nextInt();
        int[] studentsScores = new int[numberOfScores];
        for (int i = 0; i < studentsScores.length; i++) {
            System.out.println("Enter a student score: ");
            studentsScores[i] = scanner.nextInt();
        }
        assignGrades(studentsScores);
    }
}

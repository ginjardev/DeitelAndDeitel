package arraysPractise;

import java.util.Scanner;

public class SortingStudents {

    public static void sortArray(String[][] studentsScores){
        for (int i = 0; i < studentsScores[1].length; i++) {

            int min = Integer.parseInt(studentsScores[1][i]);
            int minIndex = i;
            String name = "";
            for (int j = i + 1; j < studentsScores[1].length; j++) {
                int newMin = Integer.parseInt(studentsScores[1][j]);
                if(min > newMin){
                    min = newMin;
                    minIndex = j;
                    name = studentsScores[0][1];
                }
            }

            if(minIndex != i){
                studentsScores[1][minIndex] = studentsScores[1][i];
                studentsScores[1][i] = String.valueOf(min);
                studentsScores[0][minIndex] = studentsScores[0][i];
                studentsScores[0][i] = name;
            }

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt();
        String[][] students = new String[2][size];

        for (int i = 0; i < students[1].length; i++) {
            System.out.print("Enter student #"+ (i + 1) + " name: " );
            students[0][i] = input.next();
            System.out.print("Enter student #"+ (i + 1) + " score: " );
            students[1][i] = input.next();
        }

        sortArray(students);


        for (int i =  students[1].length - 1; i >= 0; i--) {

            System.out.println("Student: " + students[0][i] + " Score: " + students[1][i]);

        }

    }
}

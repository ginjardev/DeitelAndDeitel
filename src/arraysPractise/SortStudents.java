package arraysPractise;

import java.util.Scanner;

public class SortStudents {

    static final int NAME = 0;
    static final int SCORE = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt();
        String[][] students = new String[2][size];

        for (int i = 0; i < students[SCORE].length; i++) {
            System.out.print("Enter student #"+ (i + 1) + " name: " );
            students[NAME][i] = input.next();
            System.out.print("Enter student #"+ (i + 1) + " score: " );
            students[SCORE][i] = input.next();
        }
        sort(students);
        printArray(students); // display decrementing

    }

    public static void sort(String[][] students) {

        for (int i = 0; i < students[SCORE].length - 1; i++) {

            int currentIndex = i;
            int currentMin = Integer.parseInt(students[SCORE][i]);
            String name = "";
            for (int k = i + 1; k < students[SCORE].length; k++) {

                if (currentMin > Integer.parseInt(students[SCORE][k])) {
                    currentMin = Integer.parseInt(students[SCORE][k]);
                    name = students[NAME][k];
                    currentIndex = k;
                }
            }

            if (currentIndex != i) {
                students[NAME][currentIndex] = students[NAME][i];
                students[SCORE][currentIndex] = students[SCORE][i];
                students[NAME][i] = name;
                students[SCORE][i] = Integer.toString(currentMin);
            }
        }

    }

    public static void printArray(String[][] array) {

        for (int i =  array[SCORE].length - 1; i >= 0; i--) {

            System.out.println("Student: " + array[NAME][i] + " Score: " + array[SCORE][i]);

        }
    }
}

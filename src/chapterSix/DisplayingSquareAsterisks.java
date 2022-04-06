package chapterSix;

import java.util.Scanner;

public class DisplayingSquareAsterisks {

    public static void displaySquareAsterisks(int length){
        if(length > 1){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        int length = scanner.nextInt();
        displaySquareAsterisks(length);
    }
}

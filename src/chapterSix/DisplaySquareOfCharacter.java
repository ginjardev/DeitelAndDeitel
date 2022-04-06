package chapterSix;

import java.util.Scanner;

public class DisplaySquareOfCharacter {

    public static void displaySquareOfCharacter(int length, char sym){
        if(length > 1){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(" " + sym + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of square: ");
        int length = scanner.nextInt();
        System.out.println("Enter a character (char) value: ");
        char sym = scanner.next().charAt(0);
        displaySquareOfCharacter(length,sym);
    }

}

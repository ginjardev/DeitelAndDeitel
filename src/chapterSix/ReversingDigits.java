package chapterSix;

import java.util.Scanner;

public class ReversingDigits {
    //method a
    public static int integerDivision(int numberOne, int numberTwo){
        return numberOne/numberTwo;
    }
    //method b
    public static int remainderDivision(int numberOne, int numberTwo){
        return numberOne%numberTwo;
    }

    public static void reverseDigits(int number){
        int remainder = 0;
        while(number >=1){
            remainder = remainderDivision(number,10);
            number = integerDivision(number, 10);
            System.out.print(remainder + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse digits: ");
        int number = scanner.nextInt();
        reverseDigits(number);
    }
}

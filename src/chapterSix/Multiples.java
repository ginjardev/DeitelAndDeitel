package chapterSix;

import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int firstNumber, int secondNumber){
        if(secondNumber % firstNumber == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Is second Number a multiple? " + isMultiple(firstNumber,secondNumber));
        }
    }
}

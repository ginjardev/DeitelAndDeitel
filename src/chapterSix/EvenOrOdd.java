package chapterSix;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int number){
        boolean isEven = false;
        if(number > 0){
            if(number % 2 == 0){
                isEven = true;
            }
        }else{
            System.out.println("Enter a positive number");
        }
        return isEven;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number to test if even: ");
            int number = scanner.nextInt();
            System.out.println(isEven(number));
        }
    }
}

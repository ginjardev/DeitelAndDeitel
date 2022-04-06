package arraysPractise;

import java.util.Scanner;

public class ReverseNumbers {
    public static void reverseNumbers(int...numbers){
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Enter a number: ");
            numbersArray[i] = scanner.nextInt();
        }
        reverseNumbers(numbersArray);
    }
}

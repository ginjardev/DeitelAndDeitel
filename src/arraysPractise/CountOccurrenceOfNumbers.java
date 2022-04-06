package arraysPractise;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[14];
        int[] counterArray = new int[100];
        for (int i = 0; i < numbers.length; ) {
            int check = 0;
            System.out.print("Enter a number:  ");
            check = scanner.nextInt();
            if(check > 0 && check < 101){
                numbers[i] = check;
                ++counterArray[numbers[i]];
                i++;
            }
        }
        System.out.printf("%s%7s%n", "Number ", "Frequency ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-1d%9d%n", numbers[i], counterArray[numbers[i]]);
        }

    }
}

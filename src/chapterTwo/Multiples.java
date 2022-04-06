package chapterTwo;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number ");
        int secondNumber = scanner.nextInt();

        if(firstNumber % secondNumber == 0) {
            System.out.println(firstNumber + " is a multiple of " + secondNumber);
        }

    }
}

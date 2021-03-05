package chapterTwo;
import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 digit number like 12345 ");
        int number = scanner.nextInt();

        int firstDigit = number / 10000;

        int secondNumber = number % 10000;
        int secondDigit = secondNumber / 1000;

        int thirdNumber = number % 1000;
        int thirdDigit = thirdNumber / 100;

        int fourthNumber = thirdNumber % 100;
        int fourthDigit = fourthNumber / 10;

        int fifthDigit = fourthNumber % 10;

        System.out.print(firstDigit + "  " + secondDigit + "  " + thirdDigit + "  " + fourthDigit + "  " + fifthDigit);
    }


}

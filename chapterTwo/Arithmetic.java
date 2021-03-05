package chapterTwo;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product;
        int quotient;
        int sum;
        int difference;

        System.out.println("Enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;

        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);

    }
}

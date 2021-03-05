package chapterTwo;
import java.util.Scanner;
public class SimpleArithmetic {
    // this program performs a sample payroll calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b;
        int c;

        System.out.print("Enter a number: ");
        b = scanner.nextInt();
        System.out.print("Enter another number: ");
        c = scanner.nextInt();

        int a = b * c;

        System.out.println("The answer = " + a);


    }
}

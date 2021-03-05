package chapterTwo;
import java.util.Arrays;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is larger");
        }
        if(secondNumber > firstNumber){
            System.out.println(secondNumber + " is larger");
        }
        if(firstNumber == secondNumber){
            System.out.println(firstNumber + " and " + secondNumber + ", these numbers are equal");
        }
    }
}

package chapterTwo;
import java.util.Scanner;
public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product;
        int average;
        int sum;
        int largest = 0;
        int smallest = 0;
        System.out.println("Enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter your third number: ");
        int thirdNumber = scanner.nextInt();

        product = firstNumber * secondNumber * thirdNumber;
        average = (firstNumber + secondNumber + thirdNumber)/3;
        sum = firstNumber + secondNumber + thirdNumber;

        if(firstNumber > secondNumber){
            largest = firstNumber;
        }
        if (largest > thirdNumber){
            System.out.println("largest number is " + largest);
        }
        if(secondNumber > firstNumber){
            largest = secondNumber;
        }
        if (largest > thirdNumber){
            System.out.println("largest number is " + largest);
        }
        if(thirdNumber > secondNumber){
            largest = thirdNumber;
        }
        if (largest > firstNumber){
            System.out.println("largest number is " + largest);
        }

        if(firstNumber < secondNumber){
            smallest = firstNumber;
        }
        if (smallest < thirdNumber){
            System.out.println("smallest number is " + smallest);
        }
        if(secondNumber < firstNumber) {
            smallest = secondNumber;
        }
        if (smallest < thirdNumber){
            System.out.println("smallest number is " + smallest);
        }
        if(thirdNumber < secondNumber){
            smallest = thirdNumber;
        }
        if (smallest < firstNumber){
            System.out.println("smallest number is " + smallest);
        }

        System.out.println("Product = " + product);
        System.out.println("average = " + average);
        System.out.println("Sum = " + sum);
    }
}

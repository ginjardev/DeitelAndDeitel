package chapterSix;

import java.util.Scanner;

public class FindTheMinimum {
    public static double minimumThree(double numberOne, double numberTwo, double numberThree){
        return Math.min(Math.min(numberOne, numberTwo), numberThree);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double numberThird = scanner.nextDouble();

        System.out.println(minimumThree(numberOne, numberTwo,numberThird));
    }
}

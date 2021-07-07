package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculations {

    public static void calculateHypotenuse(double sideA, double sideB){
        double sideC = 0;
        sideC =Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
        System.out.printf("%s%7s%12s%n", "SideA","SideB", "Hypotenuse");
        System.out.printf("%1.1f%8.1f%8.2f", sideA, sideB, sideC);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side A of a Triangle");
        double sideA = scanner.nextDouble();
        System.out.println("Enter Side B of a Triangle");
        double sideB = scanner.nextDouble();

        calculateHypotenuse(sideA, sideB);
    }
}

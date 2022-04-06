package chapterFour;

import java.util.Scanner;

public class SidesOfRightAngledTriangle {
    public void sidesOfRightAngledTriangle(int num1, int num2, int num3){
        if((num1*num1) + (num2 * num2) == num3 * num3){
            System.out.println(num1 + " " + num2 + " " + num3 + " represent sides of a Right_angled Triangle");
        }else {
            System.out.println(num1 + " " + num2 + " " + num3 + " are not sides of a Right_angled Triangle");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SidesOfRightAngledTriangle sidesOfRightAngledTriangle = new SidesOfRightAngledTriangle();
        System.out.println("Enter a number for side AB of triangle: ");
        int sideAB = scanner.nextInt();
        System.out.println("Enter a number for side AC of triangle: ");
        int sideAC = scanner.nextInt();
        System.out.println("Enter a number for side BC of triangle: ");
        int sideBC = scanner.nextInt();
        sidesOfRightAngledTriangle.sidesOfRightAngledTriangle(sideAB, sideAC, sideBC);
    }
}

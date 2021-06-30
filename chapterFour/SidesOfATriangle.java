package chapterFour;

import java.util.Scanner;

public class SidesOfATriangle {

    public void checkSidesOfTriangle(int ab, int ac, int bc){
        if(ab + ac > bc){
            System.out.println(ab + " " + ac +" " + bc + " represent sides of a triangle");
        }else{
            System.out.println(ab + " " + ac +" " + bc + " does not represent sides of a triangle");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SidesOfATriangle sidesOfATriangle = new SidesOfATriangle();
        System.out.println("Enter a number for side AB of triangle: ");
        int sideAB = scanner.nextInt();
        System.out.println("Enter a number for side AC of triangle: ");
        int sideAC = scanner.nextInt();
        System.out.println("Enter a number for side BC of triangle: ");
        int sideBC = scanner.nextInt();

        sidesOfATriangle.checkSidesOfTriangle(sideAB, sideAC, sideBC);

    }
}

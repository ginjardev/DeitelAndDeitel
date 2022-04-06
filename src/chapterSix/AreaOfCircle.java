package chapterSix;

import java.util.Scanner;

public class AreaOfCircle {
    public static double areaOfCircle(double radius){
        double area = 0;
        area = 3.14 * Math.pow(radius,2);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle = " + areaOfCircle(radius));
    }
}

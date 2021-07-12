package chapterSix;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static double distance(double x1, double y1, double x2, double y2){
        double distance = 0;
        distance = Math.sqrt(Math.pow((x2 - x1) + (y2 -y1), 2));
        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate values x1 & y1 for point A: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter coordinate values x2 & y2 for point B: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Distance between Point A & B is " + distance(x1, y1,x2,y2));
    }
}

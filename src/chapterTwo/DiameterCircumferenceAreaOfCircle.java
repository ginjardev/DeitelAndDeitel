package chapterTwo;
import java.util.Scanner;
public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14159;
        System.out.println("Enter a number for radius ");
        int radius = scanner.nextInt();

        System.out.printf("Diameter of circle is %d%n ", (2 * radius));
        System.out.printf("Circumference of a circle is %f%n ", (2 * PI * radius));
        System.out.printf("Area of circle is %f%n", (PI * radius * radius));

    }
}

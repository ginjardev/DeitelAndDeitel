package chapterTwo;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight(kg): ");
        double weightInKilograms = scanner.nextDouble();
        System.out.println("Enter your height(m): ");
        double heightInMeters = scanner.nextDouble();

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your Body Mass Index is " + bmi);

        System.out.println("BMI Values\nUnderweight: less than 18.5 \nNormal:      between 18.5 and 24.9 \nOverweight:  between 25 and 29\nObese:       30 or greater");
    }
}

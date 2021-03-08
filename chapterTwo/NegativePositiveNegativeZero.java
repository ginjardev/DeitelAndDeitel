package chapterTwo;
import java.util.Scanner;
public class NegativePositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number3 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number4 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number5 = scanner.nextInt();

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        if(number1 > 0){
            positiveCounter = positiveCounter + 1;
        }
        if(number2 > 0){
            positiveCounter = positiveCounter + 1;
        }
        if(number3 > 0){
            positiveCounter = positiveCounter + 1;
        }
        if(number4 > 0){
            positiveCounter = positiveCounter + 1;
        }
        if(number5 > 0){
            positiveCounter = positiveCounter + 1;
        }

        if(number1 < 0){
            negativeCounter = negativeCounter + 1;
        }
        if(number2 < 0){
            negativeCounter = negativeCounter + 1;
        }
        if(number3 < 0){
            negativeCounter = negativeCounter + 1;
        }
        if(number4 < 0){
            negativeCounter = negativeCounter + 1;
        }
        if(number5 < 0){
            negativeCounter = negativeCounter + 1;
        }

        if(number1 == 0){
            zeroCounter = zeroCounter + 1;
        }
        if(number2 == 0){
            zeroCounter = zeroCounter + 1;
        }
        if(number3 == 0){
            zeroCounter = zeroCounter + 1;
        }
        if(number4 == 0){
            zeroCounter = zeroCounter + 1;
        }
        if(number5 == 0){
            zeroCounter = zeroCounter + 1;
        }

        System.out.println("Positive numbers count is " + positiveCounter);
        System.out.println("Negative numbers count is " + negativeCounter);
        System.out.println("Zero numbers count is " + zeroCounter);

    }
}

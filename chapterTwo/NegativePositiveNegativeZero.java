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


        if(number1 > 0){
            System.out.println(number1 + " is a positive number");
        }
        if(number2 > 0){
            System.out.println(number2 + " is a positive number");
        }
        if(number3 > 0){
            System.out.println(number3 + " is a positive number");
        }
        if(number4 > 0){
            System.out.println(number4 + " is a positive number");
        }
        if(number5 > 0){
            System.out.println(number5 + " is a positive number");
        }

        if(number1 < 0){
            System.out.println(number1 + " is a negative number");
        }
        if(number2 < 0){
            System.out.println(number2 + " is a negative number");
        }
        if(number3 < 0){
            System.out.println(number3 + " is a negative number");
        }
        if(number4 < 0){
            System.out.println(number4 + " is a negative number");
        }
        if(number5 < 0){
            System.out.println(number5 + " is a negative number");
        }

        if(number1 == 0){
            System.out.println(number1 + " is zero ");
        }
        if(number2 == 0){
            System.out.println(number2 + " is zero ");
        }
        if(number3 == 0){
            System.out.println(number3 + " is zero ");
        }
        if(number4 == 0){
            System.out.println(number4 + " is zero ");
        }
        if(number5 == 0){
            System.out.println(number5 + " is zero ");
        }

    }
}

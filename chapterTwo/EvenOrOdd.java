package chapterTwo;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if its Even or Odd ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }
        if(number % 2 == 1){
            System.out.println(number + " is an odd number");
        }
    }
}

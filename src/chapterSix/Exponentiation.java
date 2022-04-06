package chapterSix;

import java.util.Scanner;

public class Exponentiation {

    public static int integerPower(int base, int exponent){

        if(base < 0 || exponent < 0) {

           System.out.println("Enter positive numbers");
            return 0;
        }else{
            int powerResult = 1;
            for (int i = 0; i < exponent; i++) {
                powerResult *= base;
            }
            return powerResult;
        }
        //return powerResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter an exponent: ");
        int exponent = scanner.nextInt();
        System.out.println(integerPower(base, exponent));
    }
}

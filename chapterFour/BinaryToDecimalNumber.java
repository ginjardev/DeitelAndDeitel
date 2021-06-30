package chapterFour;

import java.util.Scanner;

public class BinaryToDecimalNumber {
    Factorial factorial = new Factorial();
    public int modulusOfBinary(int number){
        int answer;
        answer = number%2;
        return answer;
    }
    public int splitBinaryNumber(int number){
        int newNumber = 0;
        newNumber = number/10;
        return newNumber;
    }
    public void convertBinaryToDecimal(int number){
        int newDigit = 0;
        int decimalNumber = 0;
        int power = 0;
        while (number != 0){
            newDigit = modulusOfBinary(number);
            decimalNumber += newDigit * factorial.powerOfNumberInt(2,power);
            number = splitBinaryNumber(number);
            power++;
        }
        System.out.println(decimalNumber);

    }


    public static void main(String[] args){
       BinaryToDecimalNumber binaryToDecimalNumber = new BinaryToDecimalNumber();
       binaryToDecimalNumber.convertBinaryToDecimal(1111);
    }

}

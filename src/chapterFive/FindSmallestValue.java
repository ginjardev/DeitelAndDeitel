package chapterFive;

import java.util.Scanner;

public class FindSmallestValue {
    int smallestNumber;

    public int smallestNumber(int number){
        int small = number;
        if(smallestNumber == 0){
            smallestNumber = small;
        }else if(smallestNumber > 0 && smallestNumber > small){
            smallestNumber = small;
        }else if(smallestNumber < small){

        }

        return smallestNumber;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       FindSmallestValue findSmallestValue = new FindSmallestValue();
       System.out.println("Enter a number values to collect: ");
       int valueCount = scanner.nextInt();
        int count = 0;
        while (count < valueCount){
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            System.out.println(findSmallestValue.smallestNumber(value));
            count++;
        }
    }

}

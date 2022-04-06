package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    int largest = 0;
    int secondLargest = -1;

    public void findTwoLargestNumbers(int input){
         if(input > largest){
            secondLargest = largest;
            largest = input;
         }else if(input < secondLargest){
            //do nothing
         }else if(input < largest){
             secondLargest = input;
         }

        System.out.println("the largest number is " + largest + " second largest is " + secondLargest);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        TwoLargestNumbers twoLargestNumbers = new TwoLargestNumbers();
        int counter = 0;
        while(counter < 10){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            twoLargestNumbers.findTwoLargestNumbers(number);
            counter++;
        }
    }
}

package chapterTwo;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 15;
        int thirdNumber = 25;
        int fourthNumber = 50;
        int fifthNumber = 67;
        int largest = 0;
        int smallest = 0;

        // algorithm for largest number
        if(firstNumber > largest){
            largest = firstNumber;
        }
        if(largest < secondNumber) {
            largest = secondNumber;
        }
        if(largest < thirdNumber) {
            largest = thirdNumber;
        }
        if(largest < fourthNumber) {
            largest = fourthNumber;
        }
        if(largest < fifthNumber) {
            largest = fifthNumber;
        }

        if(firstNumber > smallest){
            smallest = firstNumber;
        }
        if(secondNumber < smallest){
            smallest = secondNumber;
        }
        if (thirdNumber < smallest){
            smallest = thirdNumber;
        }
        if(fourthNumber < smallest){
            smallest = fourthNumber;
        }
        if(fifthNumber < smallest){
            smallest = fifthNumber;
        }


        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}

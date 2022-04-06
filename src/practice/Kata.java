package practice;
import java.security.SecureRandom;
import java.util.Scanner;
public class Kata {
    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;
    }

    public String calculateGrade(double grade) {
        if (grade > 90) {
            return ("Student got an A");
        } else if (grade >= 80) {
            return ("Student got a B");
        } else if (grade >= 70) {
            return ("Student got a c");
        } else if (grade >= 60) {
            return ("Student got a D");
        } else if (grade < 60) {
            return ("Student got a failed!");
        } else {
            return ("try a valid number");
        }
    }

    public boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isPrimeNumber() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = userInput.nextInt();
        if (number == 1) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public int testDrillerPrice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of copies to buy");
        int numberOfCopies = userInput.nextInt();
        int price = 0;
        if (numberOfCopies > 0) {
            if (numberOfCopies < 5) {
                price = numberOfCopies * 1500;
            }
            if (numberOfCopies >= 5 && numberOfCopies < 10) {
                price = numberOfCopies * 1400;
            }
            if (numberOfCopies >= 9 && numberOfCopies < 30) {
                price = numberOfCopies * 1200;
            }
            if (numberOfCopies >= 29 && numberOfCopies < 50) {
                price = numberOfCopies * 1100;
            }
            if (numberOfCopies >= 49 && numberOfCopies < 100) {
                price = numberOfCopies * 1000;
            }
            if (numberOfCopies >= 99 && numberOfCopies < 200) {
                price = numberOfCopies * 900;
            }
            if (numberOfCopies > 200) {
                price = numberOfCopies * 800;
            }
        } else {
            System.out.println("Enter a valid number");
        }
        return price;
    }


    public int calculatePriceFor(int testDrillerQuantity) {
        int unitPrice = 0;
        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4) {
            unitPrice = 1500;
        }
        if (testDrillerQuantity > 4 && testDrillerQuantity < 10) {
            unitPrice = 1400;
        }
        return unitPrice * testDrillerQuantity;
    }

    public int factorsOfANumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        int counter = 1;
        /*while(counter < number){

            if(number % counter == 0){
                System.out.println(counter);
            }
            counter++;
        }*/
        if (number > 1) {
            for (counter = 1; counter < number; counter++) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
            }
        }


        return counter;

    }

    public void shuffleArray(int[] intArray){
        SecureRandom random = new SecureRandom();
        for(int i = 0; i < intArray.length; i++){
            int swapOne = 0;
            int swapTwo = 0;
            int arrayIndex = random.nextInt(intArray.length);
            swapOne = intArray[i];
            swapTwo = intArray[arrayIndex];

            intArray[i] = swapTwo;
            intArray[arrayIndex] = swapOne;
        }
    }

    public void sortArray(int[] arrays){
        //SecureRandom random = new SecureRandom();
        for(int i = 0; i < arrays.length - 1; i++){

            int smallestElement = arrays[i];
            int smallestIndex = i;

            for(int j = i + 1; j < arrays.length; j++){
                if(smallestElement > arrays[j]){
                    smallestElement = arrays[j];
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){
                arrays[smallestIndex] = arrays[i];
                arrays[i] = smallestElement;
            }
        }
    }
}



package testDrivenDevelopment;

import java.security.SecureRandom;

public class Array {

    public static int getSumOfArrayElements(int[] arrays) {
        int counter = 0;
        int sumOfElements = 0;
        while(counter < arrays.length){
            sumOfElements = sumOfElements + arrays[counter];
            counter++;
        }

        return sumOfElements;
    }

    public static double getAverageOfArrayElements(int[] arrays) {
        int counter = 0;
        double averageOfElements = 0;
        int sumOfElements = 0;
        while(counter < arrays.length){
            sumOfElements = sumOfElements + arrays[counter];
            averageOfElements = (double) sumOfElements/ arrays.length;
            counter++;
        }

        return averageOfElements;
    }

    public static int getMaximumNumberInArray(int[] arrays) {

        int counter = 0;
        int maximumNumber = arrays[0];
        while(counter < arrays.length){

            if(arrays[counter] > maximumNumber ){
                maximumNumber = arrays[counter];
            }

            counter++;
        }
        return maximumNumber;
    }

    public static int getMinimumNumberInArray(int[] arrays) {
        int counter = 0;
        int minimumNumber = arrays[counter];
        while(counter < arrays.length){

            if(arrays[counter] < minimumNumber){
                minimumNumber = arrays[counter];
            }

            counter++;
        }
        return minimumNumber;
    }

    public static int getMaximumSumOfNumbersInArray(int[] arrays) {
        return (getSumOfArrayElements(arrays)  - getMinimumNumberInArray(arrays));
    }

    public static int getMinimumSumOfNumbersInArray(int[] arrays) {
        return getSumOfArrayElements(arrays) - getMaximumNumberInArray(arrays);
    }

    public static void diceRollCount(){
        SecureRandom randomNumbers = new SecureRandom();
        int[] diceArray = new int[6];
        int indexOneCounter = 0;
        int indexTwoCounter = 0;
        int indexThreeCounter = 0;
        int indexFourCounter = 0;
        int indexFiveCounter = 0;
        int indexSixCounter = 0;

        for(long counter = 1; counter <= 60000000l; counter++){
            int diceRoll = 1 + randomNumbers.nextInt(6);

            if(diceRoll == 1){
                indexOneCounter++;
                diceArray[0] = indexOneCounter;

            }else if(diceRoll == 2){
                indexTwoCounter++;;
                diceArray[1] = indexTwoCounter;

            } else if(diceRoll == 3){
                indexThreeCounter++;
                diceArray[2] = indexThreeCounter;

            }else if(diceRoll == 4){
                indexFourCounter++;
                diceArray[3] = indexFourCounter;

            }else if(diceRoll == 5){
                indexFiveCounter++;
                diceArray[4] = indexFiveCounter;

            }else if(diceRoll == 6){
                indexSixCounter++;
                diceArray[5] = indexSixCounter;

            }

        }

        System.out.printf("%s%5d%19d%19d%18d%17d%18d%n", "diceFace", 1, 2, 3, 4, 5, 6);
        for(int index: diceArray){
            System.out.printf("%18d",index);
        }

    }
    /*public static void multiArray(){
        int[][] multiArray = {{1,2, 3}, {4,5,6}, {7,8,9}};

        int[][] arr = {{1, 2}, {3, 4}};
        int sum = 0;

        for(int i = 0; i < multiArray.length; i++){

            for(int j = 0; j < multiArray.length; j++){

                System.out.print(multiArray[i][j] + " ");

                sum += multiArray[i][j];

            }
            System.out.println();
        }

        System.out.println("sum is = " + sum);
    }*/

    public static void diceRollCounter(){
        SecureRandom random = new SecureRandom();

        int[] myArray = new int[7];
        int timesOfRoll = 0;
        for (int counter = 1; counter <= 100; counter++){
            ++myArray[1 + random.nextInt(6)];
        }

        /*for(int counter = 1; counter < myArray.length; counter++){
            System.out.println(myArray[counter]);
        }*/
        for(int face : myArray) {
            if (face == 0)
                continue;
            System.out.println(face);
        }
    }




}

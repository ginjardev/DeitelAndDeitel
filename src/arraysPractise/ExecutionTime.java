package arraysPractise;

import java.security.SecureRandom;

public class ExecutionTime {

    public static int generateRandomNumber(int range){
        SecureRandom secureRandom = new SecureRandom();
        int randomNumber = 1 + secureRandom.nextInt(range);
        return randomNumber;
    }

    public static int[] createArray(int size){
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = generateRandomNumber(size);
        }
        return randomArray;
    }

    public static int linearSearchArray(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(key == array[i]){
                return i;

            }
        }
        return -1;
    }

    public static void sortArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if(minValue> array[j]){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                array[minIndex] = array[i];
                array[i] = minValue;
            }
        }
    }

    public static int binarySearchArray(int[] array, int key){

        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int mid = (high - low)/ 2;
            if(key > array[mid]){
                low = mid + 1;
            }else if(key < array[mid]){
                high = mid - 1;
            }else if (key == mid){
                return mid;
            }
        }
        return -low -1;
    }

    public static void main(String[] args) {
       int[] myArray = createArray(100000);

//        long startTime = System.currentTimeMillis();
//        int index = linearSearchArray(myArray, generateRandomNumber(5000));
//        System.out.println();
//        long endTime = System.currentTimeMillis();
//        long executionTime = endTime - startTime;
//        System.out.println("LinearSearch - Total time of search is: " + executionTime + " index = " + index);


        long startTime = System.currentTimeMillis();
        sortArray(myArray);
        int index2 = binarySearchArray(myArray,generateRandomNumber(5000));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
        System.out.println("BINARY - Total time of search is: " + executionTime + " index = " + index2);

    }
}

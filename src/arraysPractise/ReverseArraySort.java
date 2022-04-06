package arraysPractise;

public class ReverseArraySort {

    public static void reverseSortArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if(array[j] > max){
                    max = array[j];
                    maxIndex = j;
                }
            }

            if(maxIndex != i){
                array[maxIndex] = array[i];
                array[i] = max;
            }
        }
    }

    public static void reverseSort2(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                int valueOne = numberArray[i];
                int valueTwo = numberArray[j];
                if(valueOne < valueTwo){
                    numberArray[i] = valueTwo;
                    numberArray[j] = valueOne;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {23, 2, 4, 1, 20, 15};
        reverseSortArray(numbers);

        for (int ele: numbers) {
            System.out.print(ele + " ");
        }

        System.out.println();

        int[] myArray = {1, 3, 5, 8, 4, 6,};
        reverseSort2(myArray);

        for (int elem: myArray) {
            System.out.print(elem + " ");
        }

    }
}

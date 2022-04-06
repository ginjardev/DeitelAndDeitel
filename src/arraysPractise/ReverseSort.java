package arraysPractise;

public class ReverseSort {
    public static void reverseSortArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(max < array[j]){
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

    public static void main(String[] args) {
        int[] testArray = {10,0,30,43,5};
        reverseSortArray(testArray);
        for (int number : testArray) {
            System.out.print(number + " ");
        }
    }
}

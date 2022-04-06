package practice;

public class SortArray {
 /** The method for sorting the numbers */
    public void sortArray(int[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                 // Find the minimum in the list[i..list.length-1]
                 int currentMin = list[i];
                 int currentMinIndex = i;

                 for (int j = i + 1; j < list.length; j++) {
                    if (currentMin > list[j]) {
                         currentMin = list[j];
                         currentMinIndex = j;

                    }

                 }

                 // Swap list[i] with list[currentMinIndex] if necessary
                 if (currentMinIndex != i) {
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;

                 }

            }
    }

    public static void main(String[] args) {
        int[] tryArr = {23, 12, 13, 67, 50,47};
        SortArray sort = new SortArray();
        sort.sortArray(tryArr);

        for (int element : tryArr) {
            System.out.print(element + " ");
        }
    }
}

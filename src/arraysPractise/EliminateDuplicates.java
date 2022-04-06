package arraysPractise;

public class EliminateDuplicates {

    public static int[] eliminateDuplicates(int[] list) {

        int[] temp = new int[list.length];
        int tempIndex = 0;

        for (int i = 0; i < list.length; i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < temp.length; j++) {
                System.out.print( temp[j] + " ");
                if (temp[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }
            System.out.println();
        }

        int[] trimmedArray = new int[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            trimmedArray[i] = temp[i];
            //System.out.print(trimmedArray[i] + " ");
        }

        return trimmedArray;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1,6, 3,4, 5, 2};
        int[] arr2 = { 1, 2, 3, 4, 5,6, 7,8, 9, 10};
        eliminateDuplicates(arr2);
    }
}

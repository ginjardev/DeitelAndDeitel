package arraysPractise;

public class ArrayClass {

    public static void isDuplicate( int [] list) {
       int[] array = new int[list.length];
       int index = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < array.length; j++) {
                if(array[j] == list[i]){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                array[index++] = list[i];
            }
        }
        int[] array1 = new int[index];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[i];
        }
        for (int element: array1) {
            System.out.print(element + " ");
        }


    }


    public static void main(String[] args) {
        int[] arr = { 2, 10, 5, 3, 2, 4, 10, 3, 9, 1};
        isDuplicate(arr);
    }

}

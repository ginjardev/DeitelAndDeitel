package arraysPractise;

public class Sorted {

    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 1, 9};
        int[] array = {1, 2, 3, 4, 5};
        if(isSorted(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }
}

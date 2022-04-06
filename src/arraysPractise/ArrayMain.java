package arraysPractise;

public class ArrayMain {
    //array linear search
    public static  int linearSearch( int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    //array binary search
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if(key > list[mid]){
                low = mid + 1;
            }else if (key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }
        }
        return -low -1; // Not found
    }
    // sort array in ascending order
    public static void sortAscending(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            int smallestNumber = myArray[i];
            int smallestNumberIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if(myArray[j] < smallestNumber){
                    smallestNumber = myArray[j];
                    smallestNumberIndex = j;
                }
            }
            if(smallestNumberIndex != i){
                myArray[smallestNumberIndex] = myArray[i];
                myArray[i] = smallestNumber;
            }
        }
    }

    public static void main(String[] args) {
        int[] myList = {4, 15, 9, 10, 23, 78};
        // shuffling array elements
        for (int i = 0; i < myList.length; i++) {
            // create random index j
            int j = (int)(Math.random() * (i + 1));
            // swap position myList[i] with myList[j]
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        for (int elem:myList) {
           System.out.print(elem + " ");
        }
        System.out.println();

        // shifting elements in an array to the left
        int[] moveLeft = {0, 1, 2};

        int firstValue = moveLeft[0];
        for (int i = 1; i < moveLeft.length; i++) {
            moveLeft[i -1] = moveLeft[i];
        }
        moveLeft[moveLeft.length-1] = firstValue;

        for (int elem:moveLeft) {
            System.out.print(elem + " ");
        }
        System.out.println();
        // linear search & binary search test
        int[] linearSearchArray = {34, 167, 2, 23, 35, 76, 89, 100, 43};

        System.out.println(linearSearch(linearSearchArray,76));
        System.out.println(binarySearch(linearSearchArray, 35));
        //sorting array in ascending order method call
        sortAscending(linearSearchArray);
        System.out.println();
        for (int elem:linearSearchArray) {
            System.out.print(elem + " ");
        }
    }
}

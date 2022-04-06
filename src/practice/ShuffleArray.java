package practice;

import java.security.SecureRandom;

public class ShuffleArray {
    SecureRandom randomize = new SecureRandom();
    public void shuffleArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int firstElement = array[i];
            int randomIndex = randomize.nextInt(array.length);
            array[i] = array[randomIndex];
            array[randomIndex] = firstElement;
        }
    }

    public static void main(String[] args) {
        ShuffleArray shuffle = new ShuffleArray();
        int[] intArray = {2, 4, 6, 8, 10, 12, 14};
        shuffle.shuffleArray(intArray);

        for (int element : intArray){
            System.out.print(element + " ");
        }
    }

}

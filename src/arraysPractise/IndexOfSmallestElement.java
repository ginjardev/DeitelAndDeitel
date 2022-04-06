package arraysPractise;

import java.util.Scanner;

public class IndexOfSmallestElement {
    public static int indexOfSmallestElement(double[] array){
        double smallestElement = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(smallestElement > array[i]){
                smallestElement = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Enter a number: ");
            double number = scanner.nextDouble();
            myList[i] = number;
        }
        System.out.println(indexOfSmallestElement(myList));
        double[] list = {23.9, 1.0, 34.5, 0.5, 2.9, 14.9, 39.0};
        System.out.println(indexOfSmallestElement(list));
    }
}

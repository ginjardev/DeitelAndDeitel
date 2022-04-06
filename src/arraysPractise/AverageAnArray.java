package arraysPractise;

public class AverageAnArray {
    public static int average(int[] array){
        int average = 0;
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            average = total / array.length;
        }
        return average;
    }

    public static double average(double[] array){
        double average = 0;
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            average = total / array.length;
        }
        return average;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println("int Array average = " + average(myArray));

        double[] myList = {12.0, 14.5, 24.5, 20.0};
        System.out.println("double Array average = " + average(myList));
    }
}

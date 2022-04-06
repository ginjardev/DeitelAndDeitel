package arraysPractise;

import java.util.Scanner;

public class PrintDistinctNumbers {
    public static boolean isPresent(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(key == array[i]){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            if(!isPresent(numbers,value)){
                numbers[i] = value;
                ++counter;
            }else{
                numbers[i] = value;
            }
        }
        System.out.println("Number of distinct numbers = " + counter);
        System.out.println();
        System.out.println("Print distinct numbers");
        for (int i = 0; i < counter; i++) {
            System.out.print(numbers[i] + " ");
        }


    }

}

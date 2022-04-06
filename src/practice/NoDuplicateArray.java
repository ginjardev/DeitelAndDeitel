package practice;

import java.util.Scanner;

public class NoDuplicateArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number: ");
            int value = scanner.nextInt();
            if(i == 0){
                array[i] = value;
            }else{
               //while(array[i] == 0){
                   if(array[i -1] != value && array[i] == 0){
                       array[i] = value;
                   }
               //}
            }

        }
        System.out.println("\nprints array elements");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

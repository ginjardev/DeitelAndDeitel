package arraysPractise;

import java.util.Scanner;

public class IdenticalArrays {

    public static boolean equals(int[] list1, int[] list2){

        if(list1.length != list2.length) return false;

        for (int i = 0; i < list1.length; i++) {

            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array 1 size: ");
        int size1 = scanner.nextInt();
        int[] arrayOne = new int[size1];

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("enter a number");
            arrayOne[i] = scanner.nextInt();
        }

        System.out.println("Enter Array 2 size: ");
        int size2 = scanner.nextInt();
        int[] arrayTwo = new int[size2];

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("enter a number");
            arrayTwo[i] = scanner.nextInt();
        }

        if(equals(arrayOne,arrayTwo)){
            System.out.println("identical arrays");
        }else{
            System.out.println("not identical arrays");
        }
    }
}

package chapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        int counter = 0;
        while(counter < 5){
            System.out.println("Enter a number to print asterisks: ");
            int asterisks = scanner.nextInt();
            if(asterisks > 1 && asterisks < 30){
                if(counter == 0){
                    count1 = asterisks;
                }else if(counter == 1){
                    count2 = asterisks;
                }else if(counter == 2){
                    count3 = asterisks;
                }else if(counter == 3){
                    count4 = asterisks;
                }else {
                    count5 = asterisks;
                }
                counter++;
            }else{
                System.out.println("enter a number between 1 - 30 ");
            }
        }
        for (int k = 0; k < 5; k++) {
            int star = 0;
            if(k == 0){
                star = count1;
            }else if (k == 1){
                star = count2;
            }else if (k == 2){
                star = count3;
            }else if (k == 3){
                star = count4;
            }else {
                star = count5;
            }


            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

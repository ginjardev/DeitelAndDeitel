package chapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 & 19: ");
        int rows = scanner.nextInt();
        if( rows < 19 && rows > 1){
            if(rows % 2 == 1){
                int spaceValue = rows/2;
                int space1 = spaceValue, space2 = spaceValue, star = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < space1; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < star; j++) {
                        System.out.print(" * ");
                    }
                    for (int j = 0; j < space2; j++) {
                        System.out.print("   ");
                    }
                    if(i > spaceValue ){
                        star-=2; space1++; space2++;
                    }else {
                        star+=2; space1--; space2--;
                    }
                    System.out.println();
                }
            }else{
                System.out.println("You enter an even number: ");
            }
        }else{
           System.out.println("out of range");
        }
    }
}

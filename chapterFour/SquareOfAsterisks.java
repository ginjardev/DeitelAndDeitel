package chapterFour;

import java.util.Scanner;

public class SquareOfAsterisks {
    int value = 5;
    public void printSquareAsterisks(int value){
        int counter = 0;
        while(counter < value){
            int column = value;
            if(counter == 0){
                while(column > 0){
                    System.out.print("*" + " ");
                    column--;
                }
            }else if (counter == value - 1){
                while(column > 0){
                    System.out.print("*" + " ");
                    column--;
                }
            }else if(counter < value){
                System.out.printf("%s%"+(value + (value -2)) + "s", "*", "*" );
            }
            System.out.println();
            counter++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starValue = 0;
        System.out.println("Enter a number from 1 - 19 to print square: ");
        int value = scanner.nextInt();
        if(value > 1){
            if(value < 20){
                starValue = value;
            } else{
                System.out.println("out of range! ");
            }
        }else{
            System.out.println("out of range! ");
        }
        SquareOfAsterisks squareOfAsterisks = new SquareOfAsterisks();
        squareOfAsterisks.printSquareAsterisks(starValue);
    }
}

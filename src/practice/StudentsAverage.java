package practice;
import java.security.SecureRandom;
import java.util.Scanner;
public class StudentsAverage {
    public static void main(String[] args) {
      /*  Scanner userInput = new Scanner(System.in);
        double totalScore = 0.00;
        int count = 1;
        double average = 0.00;
        double score = 0.00;
        System.out.println("Enter students score: ");

        while (count < 3) {
            score = userInput.nextDouble();
            totalScore = totalScore + score;
            count++;
        }
        average = totalScore/count;
        System.out.println("The Students average score is " + average);*/

//        SecureRandom randomNumbers = new SecureRandom();
//
//        for(int counter = 1; counter <= 20; counter++){
//            int diceOne = 1 + randomNumbers.nextInt(6);
//            int diceTwo = 1 + randomNumbers.nextInt(6);
//            System.out.println("counting " + counter);
//            System.out.println("first dice throw is " + diceOne + "\nsecond dice throw is " + diceTwo);
//            System.out.println();
//        }
//
//        int[] arrays;
//        arrays = new int[5];
//        for(int counter = 0; counter < arrays.length; counter++){
//            arrays[counter] = (int)(1 + Math.random() * 12);
//            System.out.println((arrays[counter] * 0)+ "  " + counter);
//        }
//        System.out.println("Array length" +" " + arrays.length);

       /* int[][] two = new int[3][];
        two[0] = new int[4];
        two[1] = new int[4];
        two[2] = new int[6];*/

        int[][][] two = {{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15}}};

        for(int i = 0; i < two.length; i++){
            for(int j = 0; j < two[i].length; j++){
                for(int k =0; k <two[i][j].length; k++){
                    System.out.print(two[i][j][k] + " ");
                }
                System.out.println();
            }
            //System.out.println();
        }

        
        /* 0
          /|\
         / | \
          / \
         /   \
        /     \ */


    }
    }


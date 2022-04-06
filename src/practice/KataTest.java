package practice;

import practice.Kata;

import java.security.SecureRandom;

public class KataTest {
    public static void main(String[] args) {
        Kata kata = new Kata();
        int change = 0;
        int num1 = 3;
        int num2 = 4;
        int change2 = 0;

        change = num1;
        change2 = num2;
        num1 = change2;
        num2 = change;
        //System.out.println(num1);
        //System.out.println(num2);

        int[] array = {21, 12, 3, 50, 4, 17};

        kata.sortArray(array);

        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

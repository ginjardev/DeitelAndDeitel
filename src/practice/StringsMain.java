package practice;

import java.util.Arrays;

public class StringsMain {
    public static void main(String[] args){

        String string = "Management";
        char[] myChar = string.toCharArray();

        for(int i = myChar.length-1; i >= 0; i--){
           // System.out.print(myChar[i] + " ");
        }
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}

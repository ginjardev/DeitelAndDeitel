package collections;

import java.util.*;

public class LinkedListsTest {
    public static void main(String[] args) {

        String[] colorArrayA = {"red", "orange", "black", "blue", "grey", "teal"};
        List<String> colorsA = new LinkedList<String>();

        for(int i = 0; i < colorArrayA.length; i++) colorsA.add(colorArrayA[i]);

        String[] colorArrayB = {"yellow", "burgundy", "brown", "amber"};
        List<String> colorsB = new LinkedList<String>();

        for(int i = 0; i < colorArrayB.length; i++) colorsB.add(colorArrayB[i]);

        colorsA.addAll(colorsB);
        //for(int i = 0; i < colorsA.size(); i++) System.out.println(colorsA.get(i));

        colorsB = null;

        changeToUpperCase(colorsA);

        removeObj(colorsA, 4, 7);
        System.out.println("next command");
        for (String color: colorsA) {
            System.out.println(color);
        }
    }

    public static void changeToUpperCase(List<String> collection){

        Iterator<String>  iterator = collection.iterator();

        while (iterator.hasNext()){
            String word = iterator.next();
            String newWord = word.toUpperCase();
            System.out.println(newWord);

        }

    }



    public static void removeObj(List<String> color, int one, int two){

        color.subList(one, two).clear();

    }
}

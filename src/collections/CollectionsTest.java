package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {


    public static void removeColor(Collection <String> collectionOne, Collection<String> collectionTwo){
        Iterator<String> iterator = collectionOne.iterator();
        while (iterator.hasNext()){
            if(collectionTwo.contains(iterator.next()))
            iterator.remove();
        }
    }

    public static void main(String[] args) {
        String[] colorArrayOne = {"red", "green", "blue", "black", "grey"};
        String[] colorArrayTwo = {"green", "blue", "black"};

        List<String> colorsA = new ArrayList<String>();
        List<String> colorsB = new ArrayList<String>();

        for (String color: colorArrayOne) {
            colorsA.add(color);
        }

        for (String color: colorArrayTwo) {
            colorsB.add(color);
        }


        removeColor(colorsA, colorsB);

        for (String color: colorsA) {
            System.out.println(color);
        }
    }


}

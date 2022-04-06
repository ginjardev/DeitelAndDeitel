package practice;

import java.util.*;

public class CountingDuplicateWords {
    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();


        String[] tokens = input.split(" ");


        for (String token : tokens)
        {
            String word = token.toLowerCase();

            if (map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }else
                map.put(word, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        for (String key : sortedKeys){
            if (map.containsKey(key)) {
                int count = map.get(key);
                if( count > 1 )
                    System.out.printf("%-10s%10s%n", key, map.get(key));
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        createMap(testMap);
        displayMap(testMap);
    }
}

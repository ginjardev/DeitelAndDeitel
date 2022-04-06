package arraysPractise;

import java.security.SecureRandom;
import java.util.Random;

public class RandomNumberChooser {


    public static int getRandom(int... numbers){
        SecureRandom random = new SecureRandom();
        int randomNumber = 1 + random.nextInt(54);
        for (int i = 0; i < numbers.length; i++) {
            if(randomNumber == numbers[i]){
                randomNumber = 1 + random.nextInt(54);
                i = -1;
            }
        }
        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println(getRandom(1,0,12,24,30,44,50,34,51));
    }
}

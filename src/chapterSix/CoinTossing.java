package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    private static  int headCount;
    private  static int tailCount;
    public enum Coins{
        HEADS, TAILS;
    }

    public static Coins flip() {
        Coins status = Coins.HEADS;
        SecureRandom random = new SecureRandom();
        int tossValue = random.nextInt(2);
        if(tossValue == 0){
            status = Coins.TAILS;
            tailCount++;
        }else{
            headCount++;
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coins state = Coins.HEADS;
        int check = 1;
        String prompt = """
                1 to TOSS Coin
                0 to EXIT
                """;

        while(check != 0){
            System.out.println(prompt);
            check = scanner.nextInt();
            if(check == 1){
                flip();
            }
        }
        System.out.println("tail count " + headCount);
        System.out.println("head count " + tailCount);
    }
}

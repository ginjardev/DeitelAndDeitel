package chapterSix;

public class GreatestCommonDivisor {
    private static int gcd = 0;

    public static int greatestCommonDivisor(int numberOne, int numberTwo){

        for (int i = 2; i < numberOne; i++) {
            for (int j = 2; j < numberTwo; j++) {
                if(numberOne% i == 0 && numberTwo% j ==0){
                    if(i == j){
                        gcd = i;
                    }
                }
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(45,75));
    }
}

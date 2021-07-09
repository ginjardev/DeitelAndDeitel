package chapterSix;

public class PrimeNumbers {
    //method (a)
    public static boolean isPrime(int number){
        boolean isPrimeNumber = true;
        int checker = 2;
        while(checker < number){
            if(number%checker == 0){
                isPrimeNumber = false;
            }
            checker++;
        }
        return isPrimeNumber;
    }

    public static void main(String[] args) {
       //test a
        for (int i = 1; i < 10001; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        // test b
        for (int i = 1; i < 10001; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }

    }
    //method (b)
    public static boolean isPrimeNumber(int number){
        boolean isPrimeNumber = true;
        double checker = 2.0;
        double rootOfNumber = Math.floor(Math.sqrt(number));
        while(checker <= rootOfNumber){
            if(number%checker == 0){
                isPrimeNumber = false;
            }
            checker++;
        }
        return isPrimeNumber;
    }
}

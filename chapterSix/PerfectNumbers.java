package chapterSix;

public class PerfectNumbers {

    public static boolean isPerfect(int number){
        boolean isPerfectNumber = false;
        int factors = 1;
        int sum = 0;
        while(factors < number){
            if(number % factors == 0){
                sum+=factors;
            }
            if(sum == number){
                isPerfectNumber = true;
            }
            factors++;
        }
        return isPerfectNumber;
    }

    public static void main(String[] args) {
        System.out.printf("%s%10s%n", "PerfectNumber", "Factors");
        for (int i = 0; i < 1001; i++) {
            if(isPerfect(i)){
                System.out.printf("%d:%16s",i, "");
                int factors = 1;
                while(factors < i){
                    if(i % factors == 0){
                        System.out.print(factors + ", ");
                    }
                    factors++;
                }
                System.out.println();
            }
        }
    }
}
